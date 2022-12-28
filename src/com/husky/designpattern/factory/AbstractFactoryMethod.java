package com.husky.designpattern.factory;

/**
 * @author xin5
 * @since 2022年12月28日 19:31:54
 */
public abstract class AbstractFactoryMethod {
    public void operation() {
        Product product = createProduct();
        otherOperation(product);
    }

    public abstract Product createProduct();

    public void otherOperation(Product product) {
        System.out.println(product);
    };
}
