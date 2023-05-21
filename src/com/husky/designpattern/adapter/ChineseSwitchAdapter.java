package com.husky.designpattern.adapter;

/**
 * @author xin5
 * @since 2023年05月21日 19:55:53
 */
public class ChineseSwitchAdapter implements ChineseSwitchInterface {
    private USASwitchInterface usaSwitch;


    @Override
    public void chargeWithChineseStandard() {
        this.usaSwitch.chargeWithUSAStandard();
    }

    public USASwitchInterface getUsaSwitch() {
        return usaSwitch;
    }

    public void setUsaSwitch(USASwitchInterface usaSwitch) {
        this.usaSwitch = usaSwitch;
    }
}
