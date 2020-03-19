package com.designMode.realize.strategyMode.service;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 09:14
 **/

public class CatCall implements Call {
    @Override
    public void speack() {
        System.out.println("Cat call !");
    }
}
