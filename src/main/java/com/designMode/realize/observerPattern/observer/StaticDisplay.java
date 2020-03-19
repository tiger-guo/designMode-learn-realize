package com.designMode.realize.observerPattern.observer;

import com.designMode.realize.observerPattern.subject.Subject;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 14:03
 **/

public class StaticDisplay implements Observer, DisPlayElement {
    private float temperature;
    private float pressure;
    private Subject weatherData;

    public StaticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }

    @Override
    public String toString() {
        return "收到的消息：StaticDisplay{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                '}';
    }
}
