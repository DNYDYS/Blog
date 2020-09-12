package com.blog.shiro;


import com.alibaba.fastjson.JSON;
import com.blog.common.code.ENUM_CODE;
import com.blog.common.utils.HttpUtils;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @Author maiBangMin
 * @Description [用户请求过滤]
 * @Date 12:02 上午 2020/9/13
 * @Version 1.0
 **/
public class CustomUserFilter extends UserFilter {


    /*
     * @Author maiBangMin
     * @Description 判断是否是Ajax请求
     * @Date 12:13 上午 2020/9/13
     * @Param
     * @return
     **/
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        if(HttpUtils.isAjaxRequest((HttpServletRequest) request)){
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
            httpServletResponse.setContentType("application/json;charset=utf-8");
            httpServletResponse.getWriter().print(JSON.toJSON(ENUM_CODE.FAIL.getCode()));
            return false;
        }else{
            saveRequestAndRedirectToLogin(request, response);
            return false;
        }
    }

}
