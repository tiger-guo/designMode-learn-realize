package com.designMode.realize.adapterPattern;

/**
 * @program: designMode-learn&realize
 * @description: 实现国标插座的充电方法
 * @author: liuguohu
 * @create: 2020-04-13 15:41
 **/

public class CnPlugin implements CnPluginInterface {
    @Override
    public void chargeWith2Pins() {
        System.out.println("charge with CnPlugin");
    }
}