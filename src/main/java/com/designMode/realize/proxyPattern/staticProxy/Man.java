package com.designMode.realize.proxyPattern.staticProxy;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 17:34
 **/

public class Man implements Person {

    private String content;

    public Man(String content) {
        this.content = content;
    }

    @Override
    public void speak() {
        System.out.println(this.content);
    }
}
