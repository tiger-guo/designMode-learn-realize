package com.designMode.realize.templateMethodPattern;

/**
 * @program: designMode-learn&realize
 * @description: 方法框架
 * @author: liuguohu
 * @create: 2020-04-13 16:07
 **/

public abstract class CaffeinBeverage {

    final void prepareRecipe() {
        billWater();
        brew();
        pourInCup();
        addCondiments();
        if(judge()){
            addMilk();
        }
    }

    public boolean judge() {
        return true;
    }

    private void addMilk() {
        System.out.println("Adding Milk");
    }

    protected abstract void brew();

    protected abstract void addCondiments();


    private void pourInCup() {
        System.out.println("Boiling water");
    }

    private void billWater() {
        System.out.println("Pouring into cup");
    }
}
