package com.designMode.realize.singletonPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 17:31
 **/

public class Tests {


    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                System.out.println(DCLSingleton.getInstance());
            }).start();
        }
    }
}
