package com.designMode.realize.factoryPattern;

import com.designMode.realize.factoryPattern.PizzaIngredientFactory;
import com.designMode.realize.factoryPattern.domain.Dough;
import com.designMode.realize.factoryPattern.domain.Sauce;
import com.designMode.realize.factoryPattern.domain.impl.MarinaraSauce;
import com.designMode.realize.factoryPattern.domain.impl.ThinCrutDough;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 17:00
 **/

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrutDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
