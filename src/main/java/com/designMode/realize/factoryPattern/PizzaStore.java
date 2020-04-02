package com.designMode.realize.factoryPattern;

import com.designMode.realize.factoryPattern.domain.Pizza;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 15:29
 **/

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        if(pizza == null){
            System.out.println("你的订单有误！");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
