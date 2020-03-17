package com.designMode.realize.proxyMode.dynamicProxy.JDK;

import com.designMode.realize.proxyMode.dynamicProxy.JDK.Apple;
import com.designMode.realize.proxyMode.dynamicProxy.JDK.DynamicAgent;
import com.designMode.realize.proxyMode.dynamicProxy.JDK.Fruit;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 18:35
 **/

public class ReflectTest {

    @Test
    public void test() throws InvocationTargetException, IllegalAccessException {
        //注意一定要返回接口，不能返回实现类否则会报错
        Fruit fruit = (Fruit) DynamicAgent.agent(Fruit.class, new Apple());
        fruit.show();
    }
}
