package com.husky.designpattern.command;

/**
 * 空对象
 * @author xin5
 * @since 2023年01月16日 21:51:58
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
