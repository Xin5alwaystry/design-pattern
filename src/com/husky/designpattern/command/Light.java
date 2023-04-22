package com.husky.designpattern.command;

/**
 * @author xin5
 * @since 2023年01月16日 21:42:17
 */
public class Light {
    private String location;

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + "'s " + "light is on.");
    }

    public void off() {
        System.out.println(this.location + "'s " + "light is off");
    }
}
