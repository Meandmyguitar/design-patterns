package com.pattern.visitor.kpi;

/**
 * 观察接口 - 访问者需要实现此接口
 * 所有被观察者会通过此接口，将自己允许被观察的权限放出来
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
