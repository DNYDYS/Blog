package com.blog.shiro;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/*
 * @Author maiBangMin
 * @Description [Shiro配置化参数]
 * @Date 11:08 下午 2020/9/12
 * @Version 1.0
 **/
@Data
@ToString
public class ShiroProConfig {

    // shiro redis缓存时长 默认值 1800ms
    private int expireInt = 1800;

    // session 超时时间、默认 1800000ms
    private long sessionTimeout = 1800000L;

    // remember 有效时长 默认为 86400s(一天时间)
    private int cookieTimeout = 86400;

    // 注解路径(免认证)
    private String annoUrl;

    // shiro LoginUrl
    private String loginUrl = "/login";

    // shiro successUrl
    private String successUrl = "/index";

    // shiro failUrl
    private String logoutUrl = "/logout";




}
