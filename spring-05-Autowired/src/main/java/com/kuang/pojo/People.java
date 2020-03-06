package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author liuhuan
 * @create 2020-03-01 9:42
 */
public class People {
    //如果显式定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空，
    //秦疆在一个开源项目里看到的，分享给我们的
    @Resource(name = "cat11")
    private Cat cat;
    @Resource(name = "dog22")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }


    /*
    @autowired注入可以不编写set语句

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }
    */

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
