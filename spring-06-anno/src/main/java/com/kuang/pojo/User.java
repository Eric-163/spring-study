package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liuhuan
 * @create 2020-03-01 14:01
 */

//等价于<bean id="user" class="com.kuang.pojo.User"/>
//@Component  组件


@Component
@Scope("singleton")
public class User {
    @Value("kuangshen")
    public String name;

    //相当于<property name="name" value="kuangshen"/>
    @Value("狂神")
    public void setName(String name) {
        this.name = name;
    }
}
