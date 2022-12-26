package com.husky.designpattern.decorator;

import com.husky.designpattern.decorator.beverage.DarkRoast;
import com.husky.designpattern.decorator.decorator.Milk;
import com.husky.designpattern.decorator.decorator.Mocha;

/**
 * @author xin5
 * @since 2022年12月26日 22:19:17
 */
public class StarBuzz {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Milk(darkRoast);
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.cost());
        System.out.println(darkRoast.getDescription());
    }
}
