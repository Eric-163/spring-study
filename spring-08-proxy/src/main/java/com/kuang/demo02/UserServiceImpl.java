package com.kuang.demo02;

/**
 * @author liuhuan
 * @create 2020-03-02 16:25
 */

//真实对象
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");

    }

    public void update() {
        System.out.println("修改了一个用户");

    }

    public void query() {
        System.out.println("查询了一个用户");
    }
    //1.改动原有的业务代码，在公司中是大忌！
}
