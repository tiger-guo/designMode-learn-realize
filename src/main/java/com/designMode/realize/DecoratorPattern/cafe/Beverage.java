package com.designMode.realize.DecoratorPattern.cafe;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:21
 **/

public abstract class Beverage {

    String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}


