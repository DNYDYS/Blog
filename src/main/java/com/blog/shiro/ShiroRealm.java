package com.blog.shiro;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/*
 * @Author maiBangMin
 * @Description [Shiro自定义实现认证和授权]
 * @Date 12:59 下午 2020/9/13
 * @Version 1.0
 **/
public class ShiroRealm extends AuthorizingRealm {
    
    
    /*
     * @Author maiBangMin
     * @Description 用户认证
     * @Date 1:00 下午 2020/9/13
     * @Param 
     * @return 
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }

    
    /*
     * @Author maiBangMin
     * @Description 用户授权
     * @Date 1:00 下午 2020/9/13
     * @Param 
     * @return 
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    
}
