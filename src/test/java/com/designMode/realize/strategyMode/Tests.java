package com.designMode.realize.strategyMode;

import com.designMode.realize.strategyMode.domain.Dog;
import com.designMode.realize.strategyMode.service.DogNoCall;

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
