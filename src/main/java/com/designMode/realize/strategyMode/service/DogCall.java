package com.designMode.realize.strategyMode.service;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 09:11
 **/

public class DogCall implements Call {

    @Override
    public void speack() {
        System.out.println("Dog call!");
    }
}
