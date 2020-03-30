package com.designMode.realize.DecoratorPattern.cafe;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:45
 **/

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ". Milk";
    }

    @Override
    public double cost() {
        return .3 + beverage.cost();
    }
}
