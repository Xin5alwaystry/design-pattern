package com.husky.designpattern.singleton;

/**
 * @author xin5
 * @since 2023年01月04日 22:34:48
 */
public class SingletonEager {
    //此处使用volatile是为了禁止指令重排序，防止在多线程环境下，单例还没创建完成就被使用。
    private volatile SingletonEager instance;

    public SingletonEager getInstance() {
        //此处使用了双重检查加锁
        //目的是提高性能，避免每次获取单例时都要上锁
        if (instance == null) {
            synchronized (SingletonEager.class) {
                if (instance == null) {
                    instance = new SingletonEager();
                }
            }
        }
        return instance;
    }

    private SingletonEager() {}
}
