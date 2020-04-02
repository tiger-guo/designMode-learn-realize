package com.designMode.realize.factoryPattern.domain.impl;

import com.designMode.realize.factoryPattern.PizzaIngredientFactory;
import com.designMode.realize.factoryPattern.domain.Pizza;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 15:49
 **/

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("NYStyleCheesePizza");
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    public void bake() {
        System.out.println("NYStyleCheesePizz bake");
    }

    @Override
    public void cut() {
        System.out.println("NYStyleCheesePizz cut");
    }

    @Override
    public void box() {
        System.out.println("NYStyleCheesePizz box");
    }
}
