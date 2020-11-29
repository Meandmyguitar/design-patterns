package com.pattern.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassPath : LazyStaticInnerClassSingleton.class
 * LazyStaticInnerClassSingleton$LazyHolder.class
 * 优点：写法优雅，利用了Java本身语法特点，性能高，避免了内存浪费,不能被反射破坏
 * 缺点：不优雅
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        //防止反射破坏
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazyStaticInnerClassSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();
        System.out.println(instance);
    }

}
