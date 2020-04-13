package com.designMode.realize.templateMethodPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-13 16:13
 **/

public class Tests {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("---------------------");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
