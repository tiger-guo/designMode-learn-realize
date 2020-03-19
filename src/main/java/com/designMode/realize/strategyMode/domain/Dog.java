package com.designMode.realize.strategyMode.domain;

import com.designMode.realize.strategyMode.service.DogCall;

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
