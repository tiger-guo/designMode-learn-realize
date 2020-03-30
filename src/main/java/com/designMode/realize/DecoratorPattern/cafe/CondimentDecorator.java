package com.designMode.realize.DecoratorPattern.cafe;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:38
 **/

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
