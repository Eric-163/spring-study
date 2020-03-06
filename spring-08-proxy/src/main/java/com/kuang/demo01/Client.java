package com.kuang.demo01;

/**
 * @author liuhuan
 * @create 2020-03-02 14:33
 */
public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();
        //房东要出租房子
        Host host = new Host();
        //代理
        //中介帮房东出租房子，但是，中介（代理角色）
        //一般会有一些附属操作！
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接找中介租房即可！
        proxy.rent();
    }
}
