package com.pattern.prototype.singleton;

import lombok.Data;

import java.util.List;

@Data
public class ConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> hobbies;

    private static ConcretePrototype instance = new ConcretePrototype();

    private ConcretePrototype() {
    }

    public static ConcretePrototype getInstance() {
        return instance;
    }

    @Override
    public ConcretePrototype clone() {
        //原型模式和单例模式互斥
        return instance;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" + "age=" + age + ", name='" + name + '\'' + ", hobbies=" + hobbies + '}';
    }
}
