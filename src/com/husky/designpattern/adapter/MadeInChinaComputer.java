package com.husky.designpattern.adapter;

/**
 * @author xin5
 * @since 2023年05月21日 19:55:19
 */
public class MadeInChinaComputer {
    public static void main(String[] args) {
        ChineseSwitchAdapter adapter = new ChineseSwitchAdapter();
        adapter.setUsaSwitch(new USASwitch());
        adapter.chargeWithChineseStandard();
    }
}
