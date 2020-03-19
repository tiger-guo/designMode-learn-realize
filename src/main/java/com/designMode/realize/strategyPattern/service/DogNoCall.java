package com.designMode.realize.strategyPattern.service;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 09:12
 **/

public class DogNoCall implements Call{

    @Override
    public void speack() {
        System.out.println("Dog not can call!");
    }
}
