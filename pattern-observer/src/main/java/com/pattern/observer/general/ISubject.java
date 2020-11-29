package com.pattern.observer.general;

/**
 * 抽象主题者
 * @param <E>
 */
public interface ISubject<E> {

    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}