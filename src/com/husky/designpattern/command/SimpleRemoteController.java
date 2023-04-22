package com.husky.designpattern.command;

/**
 * @author xin5
 * @since 2023年01月16日 21:52:26
 */
public class SimpleRemoteController {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
