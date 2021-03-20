package com.mitchell.factory.factoryMethod;

/**
 * @author xin5
 * @date 2021年03月20日 22:22:15
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        String type = "B";
        ApizzaCreator apizzaCreator = new ApizzaCreator();
        apizzaCreator.createPizza(type).description();
    }
}
