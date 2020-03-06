package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;

/**
 * @author liuhuan
 * @create 2020-03-02 18:08
 */
public class Client {
    public static <userService> void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //第1步：设置要代理的对象
        pih.setTarget(userService);
        //第2步：动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        //第3步：处理代理实例，并返回结果
        proxy.add();

    }
}
