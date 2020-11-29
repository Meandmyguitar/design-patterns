package com.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);

        //拷贝原型对象
        //使用中注意浅克隆 共享对象的问题
        ConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies().add("技术控1");

        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneType);
        System.out.println(prototype == cloneType);

        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());

    }

}
