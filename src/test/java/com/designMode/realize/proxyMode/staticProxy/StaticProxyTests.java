package com.designMode.realize.proxyMode.staticProxy;

import org.junit.Test;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-17 17:39
 **/

public class StaticProxyTests {

    @Test
    public void test() {
        Man man = new Man("I am static proxy man!");
        Agent agent = new Agent(man, "before", "after");
        agent.speak();
    }
}
