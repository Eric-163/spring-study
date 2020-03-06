package com.kuang.demo02;

/**
 * @author liuhuan
 * @create 2020-03-02 16:28
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.update();

    }
}
