package com.designMode.realize.proxyMode.staticProxy;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 17:36
 **/

public class Agent implements Person {

    private Man man;
    private String before;
    private String after;

    public Agent(Man man, String before, String after) {
        this.man = man;
        this.before = before;
        this.after = after;
    }

    @Override
    public void speak() {
        //before speak
        System.out.println("Before actor speak, Agent say: " + before);
        //real speak
        this.man.speak();
        //after speak
        System.out.println("After actor speak, Agent say: " + after);
    }
}
