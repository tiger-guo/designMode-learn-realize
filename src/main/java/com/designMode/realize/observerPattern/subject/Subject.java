package com.designMode.realize.observerPattern.subject;

import com.designMode.realize.observerPattern.observer.Observer;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-19 13:46
 **/

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
