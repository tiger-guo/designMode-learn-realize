package com.designMode.realize.commandPattern;

import com.designMode.realize.commandPattern.domain.Light;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-03 15:01
 **/

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
