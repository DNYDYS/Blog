package com.blog.shiro;


import cn.hutool.core.codec.Base64;
import com.sun.javafx.logging.JFRInputEvent;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.SessionListener;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.util.Base64Utils;

import javax.servlet.Filter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/*
 * @Author maiBangMin
 * TODO
 * @Description [Shiro配置类]
 * @Date 8:34 下午 2020/9/12
 * @Version 1.0
 **/
@Configuration
public class ShiroConfig {

    @Autowired
    private ShiroProperties shiroProperties;

    @Autowired
    private RedisSessionDAO redisSessionDAO;

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.database:0}")
    private int database;


    /*
     * @Author maiBangMin
     * @Description 配置 RememberMe Cookie的具体参数信息
     * @Date 11:52 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean
    public SimpleCookie rememberMeCookie(){
        // 设置 cookie 名称，对应 login.html 页面的 <input type="checkbox" name="rememberMe"/>
        SimpleCookie cookie = new SimpleCookie("rememberMe");
        // 设置 cookie 的过期时间 单位为s
        cookie.setMaxAge(shiroProperties.getShiroProConfig().getCookieTimeout());
        return cookie;
    }



    /*
     * @Author maiBangMin
     * @Description 配置 RememberMe cookieInfo
     * @Date 11:56 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean
    public CookieRememberMeManager rememberMeManager(){
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        // cookie 加密的秘钥
        String encryptKey = "diary-shiro-key";
        byte[] encryptKeyBytes = encryptKey.getBytes(StandardCharsets.UTF_8);
        String rememberKey = Base64Utils.encodeToString(Arrays.copyOf(encryptKeyBytes, 16));
        cookieRememberMeManager.setCipherKey(Base64.decode(rememberKey));
        return cookieRememberMeManager;
    }


    /*
     * @Author maiBangMin
     * @Description 配置Shiro安全管理中心
     * @Date 11:58 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        // 配置shiroRealm(自定义认证和授权)
        defaultWebSecurityManager.setRealm(shiroRealm());
        // 配置 rememberMeCookie
        defaultWebSecurityManager.setRememberMeManager(rememberMeManager());
        // 配置 cacheManagerInfo
        defaultWebSecurityManager.setCacheManager(cacheManager());
        defaultWebSecurityManager.setSessionManager(sessionManager());
        return defaultWebSecurityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 获取过滤信息
        Map<String, Filter> filters = shiroFilterFactoryBean.getFilters();
        filters.put("user",new CustomUserFilter());

        // 设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 登录的url
        shiroFilterFactoryBean.setLoginUrl(shiroProperties.getShiroProConfig().getLoginUrl());
        // 登录成功的url
        shiroFilterFactoryBean.setSuccessUrl(shiroProperties.getShiroProConfig().getSuccessUrl());
        // 登录失败的url
        shiroFilterFactoryBean.setUnauthorizedUrl(shiroProperties.getShiroProConfig().getLogoutUrl());

        // TODO  shiro自定义拦截链待补全
        return null;
    }



    /*
     * @Author maiBangMin
     * @Description 配置使用redis作为缓存
     * @Date 11:44 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean
    public RedisCacheManager cacheManager(){
        RedisOperations redisTemplate;
        org.crazycake.shiro.RedisCacheManager redisCacheManager = new RedisCacheManager();
        return redisCacheManager;
    }

    /*
     * @Author maiBangMin
     * @Description 配置redis节点信息
     * @Date 11:38 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean
    public RedisManager redisManager(){
        RedisManager redisManager = new RedisManager();
        // 缓存时间,单位s
        redisManager.setHost(host);
        redisManager.setPort(port);
        redisManager.setTimeout(timeout);
        redisManager.setDatabase(database);
        if(StringUtils.isNotEmpty(password)){
            redisManager.setPassword(password);
        }
        return redisManager;
    }

    /*
     * @Author maiBangMin
     * @Description 配置redis存储SessionDao
     * @Date 11:39 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean
    public RedisSessionDAO redisSessionDAO(){
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager());
        return redisSessionDAO;
    }

    /*
     * @Author maiBangMin
     * @Description 配置会话管理
     * @Date 11:42 下午 2020/9/12
     * @Param
     * @return
     **/
    @Bean public DefaultWebSessionManager sessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        Collection<SessionListener> listeners = new ArrayList<>();
        listeners.add(new ShiroSessionListener());
        // 设置Session 超时时间，1/ms
        sessionManager.setGlobalSessionTimeout(shiroProperties.getShiroProConfig().getSessionTimeout());
        sessionManager.setSessionListeners(listeners);
        sessionManager.setSessionDAO(redisSessionDAO());
        // 禁止Tomcat服务器暴露JESSIONID
        sessionManager.setSessionIdUrlRewritingEnabled(false);
        return sessionManager;
    }

}
