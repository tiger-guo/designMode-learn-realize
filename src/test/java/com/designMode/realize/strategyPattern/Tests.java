package com.designMode.realize.strategyPattern;

import com.designMode.realize.strategyPattern.domain.Dog;
import com.designMode.realize.strategyPattern.service.DogNoCall;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 09:25
 **/

public class Tests {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speack();
        dog.setCall(new DogNoCall());
        dog.speack();
    }


}
