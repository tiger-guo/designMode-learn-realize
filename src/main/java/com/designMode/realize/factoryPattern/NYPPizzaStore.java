package com.designMode.realize.factoryPattern;

import com.designMode.realize.factoryPattern.domain.Pizza;
import com.designMode.realize.factoryPattern.domain.impl.NYStyleCheesePizza;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 15:48
 **/

public class NYPPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza(ingredientFactory);
        }else{

        }
        return pizza;
    }
}
