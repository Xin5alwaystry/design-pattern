package com.husky.designpattern.strategy;

import com.husky.designpattern.strategy.clean.Clean;

/**
 * @author xin5
 * @date 2022年12月25日 19:38:24
 */
public class Host {
    private Clean clean;

    public void cleanHouse() {
        clean.doClean();
    }

    public void setClean(Clean clean) {
        this.clean = clean;
    }
}
