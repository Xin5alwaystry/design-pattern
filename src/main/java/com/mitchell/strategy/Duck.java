package com.mitchell.strategy;

/**
 * @author xin5
 * @date 2021年03月13日 00:05:01
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks can swim.");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}