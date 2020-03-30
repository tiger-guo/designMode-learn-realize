package com.designMode.realize.DecoratorPattern.cafe;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:41
 **/

public class HouseBlend extends Beverage {

    int size;

    public HouseBlend(int size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    public int getSize() {
        return size;
    }

    @Override
    public double cost() {
        return getSize()*1.99;
    }
}
