//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pattern.proxy.dynamicproxy.myproxy.proxy;

import com.pattern.proxy.dynamicproxy.myproxy.client.IPerson;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class $Proxy0 implements IPerson {
    MyInvocationHandler h;

    public $Proxy0(MyInvocationHandler var1) {
        this.h = var1;
    }

    public void findLove() {
        try {
            Method var1 = IPerson.class.getMethod("findLove");
            this.h.invoke(this, var1, new Object[0]);
        } catch (Error var2) {
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }

    }

    public void buyInsure() {
        try {
            Method var1 = IPerson.class.getMethod("buyInsure");
            this.h.invoke(this, var1, new Object[0]);
        } catch (Error var2) {
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }

    }
}
