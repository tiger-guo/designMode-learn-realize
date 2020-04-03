package com.designMode.realize.commandPattern;

import com.designMode.realize.commandPattern.domain.Light;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-03 15:06
 **/

public class Tests {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);

        control.setCommand(command);
        control.buttonWasPressed();
    }
}
