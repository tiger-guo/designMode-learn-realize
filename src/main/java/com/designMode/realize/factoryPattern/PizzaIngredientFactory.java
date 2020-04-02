package com.designMode.realize.factoryPattern;

import com.designMode.realize.factoryPattern.domain.Dough;
import com.designMode.realize.factoryPattern.domain.Sauce;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 16:59
 **/

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
}
