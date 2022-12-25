package com.husky.designpattern.strategy.clean;

/**
 * @author xin5
 * @date 2022年12月25日 19:35:22
 */
public class SelfClean implements Clean {
    @Override
    public void doClean() {
        System.out.println("自己做卫生...");
    }
}
