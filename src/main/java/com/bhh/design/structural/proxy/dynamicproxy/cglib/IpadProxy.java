package com.bhh.design.structural.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.ibatis.executor.loader.cglib.CglibProxyFactory;

import java.lang.reflect.Method;

/**
 * @author bhh
 * @description cglib动态代理
 * @date Created in 2021-04-23 18:58
 * @modified By
 */
public class IpadProxy implements MethodInterceptor {
    private Object obj;

    public IpadProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 代理 过程处理器(代理实现什么)
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeMethod();
        method.invoke(obj, objects);
        afterMethod();
        return null;
    }

    /**
     * 代理 执行器
     * @return
     */
    public Object executor(){
        return Enhancer.create(obj.getClass(), this);
    }

    private void afterMethod() {
        System.out.println("用ipadPencil操作ipad学习");
    }

    private void beforeMethod() {
        System.out.println("购买ipad");
    }


}
