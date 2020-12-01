package com.pattern.iterator.general;

//抽象迭代器
public interface Iterator<E> {

    E next();

    boolean hasNext();
}