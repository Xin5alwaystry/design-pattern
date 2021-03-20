package com.mitchell.factory.simplefactory;

import com.mitchell.factory.product.Apizza;
import com.mitchell.factory.product.Bpizza;
import com.mitchell.factory.product.Cpizza;
import com.mitchell.factory.product.Pizza;

/**
 * @author xin5
 * @date 2021年03月20日 22:09:40
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //没有使用简单工厂方法
        String type = "A";
        Pizza pizza = null;
        if ("A".equals(type)) {
            pizza = new Apizza();
        } else if ("B".equals(type)) {
            pizza = new Bpizza();
        } else if ("C".equals(type)) {
            pizza = new Cpizza();
        }
        pizza.description();

        System.out.println("#############");
        //利用简单工厂方法
        SimpleFactory factory = new SimpleFactory();
        Pizza tmpPizza = factory.createPizza(type);
        tmpPizza.description();
    }
}
