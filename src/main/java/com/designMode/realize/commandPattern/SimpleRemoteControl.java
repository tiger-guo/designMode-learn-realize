package com.designMode.realize.commandPattern;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-04-03 15:04
 **/

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
