package com.husky.designpattern.command;

/**
 * @author xin5
 * @since 2023年01月16日 21:41:41
 */
public interface Command {
    void execute();

    void undo();
}
