package com.renren;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/9/6.
 */
public class ReentrantLockDemo {
    private final String name = "jinshi";
    Lock lock = new ReentrantLock();

    public void add(){
        lock.lock();
    }
}
