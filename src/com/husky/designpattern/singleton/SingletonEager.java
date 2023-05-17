package com.husky.designpattern.singleton;

/**
 * @author xin5
 * @since 2023年01月04日 22:31:29
 */
public class SingletonEager {
    //JVM保证了instance创建过程的线程安全。
    private static final SingletonEager instance = new SingletonEager();

    //单例模式必须有一个私有的构造器，这样就没有办法从外部创建该类的实例。
    public static SingletonEager getInstance() {
        return instance;
    }

    private SingletonEager() {}
}
