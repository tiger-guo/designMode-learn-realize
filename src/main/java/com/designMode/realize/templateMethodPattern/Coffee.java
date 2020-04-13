package com.designMode.realize.templateMethodPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-13 16:12
 **/

public class Coffee extends CaffeinBeverage {

    @Override
    protected void brew() {
        System.out.println("Drop Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
