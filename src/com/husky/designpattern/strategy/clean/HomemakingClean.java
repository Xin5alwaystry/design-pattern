package com.husky.designpattern.strategy.clean;

/**
 * @author xin5
 * @date 2022年12月25日 19:37:38
 */
public class HomemakingClean implements Clean {
    @Override
    public void doClean() {
        System.out.println("家政人员做卫生...");
    }
}
