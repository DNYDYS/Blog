package com.blog.shiro;


import com.blog.model.Account;
import com.blog.service.AccountService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * @Author maiBangMin
 * @Description [Shiro自定义实现认证和授权]
 * @Date 12:59 下午 2020/9/13
 * @Version 1.0
 **/
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private AccountService accountService;
    
    /*
     * @Author maiBangMin
     * @Description 用户认证
     * @Date 1:00 下午 2020/9/13
     * @Param 
     * @return 
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户输入的用户名和密码
        String userName = token.getPrincipal().toString();
        String passWord = token.getCredentials().toString();

        // 通过用户名获取用户信息
        Account account = accountService.queryAccountByAccountName(userName);

        if(null == account){
            throw new UnknownAccountException("用户名密码错误");
        }
        if(passWord != account.getAccPwd()){
            throw new IncorrectCredentialsException("用户名密码错误");

        }
        return new SimpleAuthenticationInfo(account,passWord,getName());
    }

    
    /*
     * @Author maiBangMin
     * @Description 用户授权
     * @Date 2:10 下午 2020/9/13
     * @Param 
     * @return 
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    
}
