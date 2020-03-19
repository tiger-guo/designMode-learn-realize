package com.designMode.realize.observerPattern;

import com.designMode.realize.observerPattern.observer.CorrentConditionDisplay;
import com.designMode.realize.observerPattern.observer.StaticDisplay;
import com.designMode.realize.observerPattern.subject.WeatherData;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 14:09
 **/

public class Tests {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CorrentConditionDisplay currentDisplay = new CorrentConditionDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(66,20,77);
    }
}
