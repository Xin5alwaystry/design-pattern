package com.husky.designpattern.template;

/**
 * @author xin5
 * @since 2023年05月27日 16:18:24
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    abstract void brew();

    void boilWater() {
        System.out.println("Boiling water.");
    }
}
