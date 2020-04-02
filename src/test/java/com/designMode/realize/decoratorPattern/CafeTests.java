package com.designMode.realize.decoratorPattern;

import com.designMode.realize.decoratorPattern.cafe.HouseBlend;
import com.designMode.realize.decoratorPattern.cafe.Milk;
import com.designMode.realize.decoratorPattern.cafe.Mocha;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:48
 **/

public class CafeTests {

    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend(1);
        Milk milk = new Milk(houseBlend);

        System.out.println(milk.getDescription() + "=" + milk.cost());

        Mocha mocha = new Mocha(milk);
        System.out.println(mocha.getDescription() + "=" + mocha.cost());
    }


}
