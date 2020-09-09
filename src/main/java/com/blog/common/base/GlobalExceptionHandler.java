package com.blog.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理，除了需要在catch中处理业务逻辑外无需再写catch-exception
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResponce<String> exceptionHandler(HttpServletRequest request, Exception e) throws Exception{
        logger.error("{},{}",e.getMessage(),e);
        return CommonResponce.FAILED();
    }

}
