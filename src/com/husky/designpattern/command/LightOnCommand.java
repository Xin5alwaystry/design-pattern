package com.husky.designpattern.command;

/**
 * @author xin5
 * @since 2023年01月16日 21:43:22
 */
public class LightOnCommand implements Command {

    private Light light;


    public LightOnCommand() {
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
