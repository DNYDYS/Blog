package com.blog.shiro;


import lombok.Data;
import lombok.ToString;

/*
 * @Author maiBangMin
 * @Description [图片验证码参数配置]
 * @Date 10:54 下午 2020/9/12
 * @Version 1.0
 **/
@Data
@ToString
public class ValidateCodeProperties {

    private int width = 146;

    private int height = 33;

    private int length = 4;
}
