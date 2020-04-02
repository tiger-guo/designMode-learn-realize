package com.designMode.realize.factoryPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 15:50
 **/

public class Tests {


    public static void main(String[] args) {
        PizzaStore store = new NYPPizzaStore();
        store.orderPizza("cheese");
    }
}
