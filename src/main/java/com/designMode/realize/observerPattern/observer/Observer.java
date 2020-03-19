package com.designMode.realize.observerPattern.observer;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 13:47
 **/

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
