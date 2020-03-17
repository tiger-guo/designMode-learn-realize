package com.designMode.realize.proxyMode.dynamicProxy.JDK;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 18:27
 **/

public class Apple implements Fruit {

    @Override
    public void show() {
        System.out.println("-------- invoked --------");
    }
}
