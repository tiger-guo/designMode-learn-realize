package com.designMode.realize.decoratorPattern;

import com.designMode.realize.DecoratorPattern.cafe.HouseBlend;
import com.designMode.realize.DecoratorPattern.cafe.Milk;
import com.designMode.realize.DecoratorPattern.cafe.Mocha;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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
