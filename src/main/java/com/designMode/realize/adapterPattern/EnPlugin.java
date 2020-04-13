package com.designMode.realize.adapterPattern;

/**
 * @program: designMode-learn&realize
 * @description: 实现英标插座的充电方法
 * @author: liuguohu
 * @create: 2020-04-13 15:44
 **/

public class EnPlugin implements EnPluginInterface {
    @Override
    public void chargeWith3Pins() {
        System.out.println("charge with EnPlugin");
    }
}
