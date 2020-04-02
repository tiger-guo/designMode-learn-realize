package com.designMode.realize.singletonPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-02 17:29
 **/

public class DCLSingleton {
    private volatile static DCLSingleton singleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance(){
        if(singleton == null){
            synchronized (DCLSingleton.class){
                if(singleton == null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
