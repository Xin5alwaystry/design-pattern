package com.husky.designpattern.strategy.clean;

/**
 * @author xin5
 * @date 2022年12月25日 19:35:59
 */
public class RobotClean implements Clean {
    @Override
    public void doClean() {
        System.out.println("机器人做卫生...");
    }
}
