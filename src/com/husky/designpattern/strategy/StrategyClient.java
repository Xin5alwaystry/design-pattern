package com.husky.designpattern.strategy;

import com.husky.designpattern.strategy.clean.HomemakingClean;
import com.husky.designpattern.strategy.clean.RobotClean;
import com.husky.designpattern.strategy.clean.SelfClean;

/**
 * @author xin5
 * @date 2022年12月25日 19:39:09
 */
public class StrategyClient {
    public static void main(String[] args) {
        Host host = new Host();
        host.setClean(new SelfClean());
        host.cleanHouse();

        host.setClean(new RobotClean());
        host.cleanHouse();

        host.setClean(new HomemakingClean());
        host.cleanHouse();
    }
}
