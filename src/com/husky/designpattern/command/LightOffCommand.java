package com.husky.designpattern.command;

/**
 * @author xin5
 * @since 2023年01月16日 22:04:25
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand() {
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
