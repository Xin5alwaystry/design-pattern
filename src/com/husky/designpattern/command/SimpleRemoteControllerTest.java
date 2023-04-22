package com.husky.designpattern.command;

/**
 * @author xin5
 * @since 2023年01月16日 21:53:53
 */
public class SimpleRemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        Light light = new Light("Living room");
        Command command = new LightOnCommand(light);
        simpleRemoteController.setCommand(command);
        simpleRemoteController.buttonWasPressed();
    }
}
