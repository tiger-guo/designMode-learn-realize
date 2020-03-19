package com.designMode.realize.strategyPattern.domain;

import com.designMode.realize.strategyPattern.service.Call;

/**
 * @program: designMode-learn&realize
 * @description: 基类
 * @author: liuguohu
 * @create: 2020-03-19 09:15
 **/

public abstract class Animal {

    Call call;

    public void setCall(Call call) {
        this.call = call;
    }

    public void run(){
        System.out.println(">>> run >>>");
    }

    public void sleep(){
        System.out.println(">>> sleep >>>");
    }

    public void speack(){
        call.speack();;
    }
}
