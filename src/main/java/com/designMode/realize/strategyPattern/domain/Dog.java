package com.designMode.realize.strategyPattern.domain;

import com.designMode.realize.strategyPattern.service.DogCall;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 09:18
 **/

public class Dog extends Animal {

    public Dog() {
        call = new DogCall();
    }
}
