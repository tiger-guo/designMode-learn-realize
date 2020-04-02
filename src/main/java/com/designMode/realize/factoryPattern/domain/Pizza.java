package com.designMode.realize.factoryPattern.domain;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 15:44
 **/

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;

    public abstract void prepare() ;

    public void bake() {
        System.out.println("------Null-----");
    }

    public void cut() {
        System.out.println("------Null-----");
    }

    public void box() {
        System.out.println("------Null-----");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                '}';
    }
}
