package com.blog.shiro;


import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * @Author maiBangMin
 * @Description [Session会话监听]
 * @Date 8:41 下午 2020/9/12
 * @Version 1.0
 **/
public class ShiroSessionListener implements SessionListener {

    // 统计在线人数 AtomicIntger juc下的绝对线程安全
    private final AtomicInteger sessionCount = new AtomicInteger(0);

    // 会话创建时触发 -》 在线人数加一
    @Override
    public void onStart(Session session) {
        sessionCount.incrementAndGet();
    }

    // 会话结束时触发 -》 在线人数减一
    @Override
    public void onStop(Session session) {
        sessionCount.decrementAndGet();
    }

    // 会话过期时触发  -》 在线人数减一
    @Override
    public void onExpiration(Session session) {
        sessionCount.decrementAndGet();
    }

    // 获取当前在线人数
    public AtomicInteger getSessionCount(){
        return sessionCount;
    }
}

