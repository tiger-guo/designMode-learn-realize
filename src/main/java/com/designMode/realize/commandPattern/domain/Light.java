package com.designMode.realize.commandPattern.domain;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-03 15:02
 **/

public class Light {

    private String name;

    public void on() {
        System.out.println(name + ":-------Light ON!-------");
    }

    public void off() {
        System.out.println(name + ":-------Light OFF!-------");
    }
}
