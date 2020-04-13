package com.designMode.realize.templateMethodPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-13 16:11
 **/

public class Tea extends CaffeinBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public boolean judge() {
        return false;
    }
}
