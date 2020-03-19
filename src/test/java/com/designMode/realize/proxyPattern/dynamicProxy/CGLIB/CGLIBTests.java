package com.designMode.realize.proxyPattern.dynamicProxy.CGLIB;

import com.designMode.realize.proxyPattern.dynamicProxy.JDK.Apple;
import org.junit.Test;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 18:57
 **/

public class CGLIBTests {

    @Test
    public void test(){
        CGLIBAgent cGlibAgent = new CGLIBAgent();
        Apple apple = (Apple) cGlibAgent.getInstance(new Apple());
        apple.show();
    }
}
