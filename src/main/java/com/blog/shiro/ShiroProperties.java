package com.blog.shiro;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
 * @Author maiBangMin
 * TODO
 * @Description [ShiroProperties]
 * @Date 10:49 下午 2020/9/12
 * @Version 1.0
 **/
@ToString
@Data
@Configuration
@ConfigurationProperties(prefix = "febs")
public class ShiroProperties {

    private ShiroProConfig ShiroProConfig;

    private ValidateCodeProperties validateCodeProperties;

    private String timeFormat = "yyyy-MM-dd HH:mm:ss";

    private boolean openAopLog = true;
}
