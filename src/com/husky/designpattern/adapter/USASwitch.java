package com.husky.designpattern.adapter;

/**
 * @author xin5
 * @since 2023年05月21日 19:53:47
 */
public class USASwitch implements USASwitchInterface {
    @Override
    public void chargeWithUSAStandard() {
        System.out.println("Charge with usa standard.");
    }
}
