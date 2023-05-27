package com.husky.designpattern.template;

/**
 * @author xin5
 * @since 2023年05月27日 17:42:33
 */
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Tea();
        beverage.prepareRecipe();

        beverage = new Coffee();
        beverage.prepareRecipe();
    }
}
