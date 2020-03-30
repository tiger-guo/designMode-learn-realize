package com.designMode.realize.DecoratorPattern.cafe;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:44
 **/

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ". Mocha";
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }
}
