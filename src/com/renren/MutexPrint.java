package com.renren;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/9/8.
 */
public class MutexPrint {

    private final Semaphore semaphore = new Semaphore(1);

    public void print(String str) throws InterruptedException {
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName()+"enter .....");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("正在打印......");
        System.out.println("-------------------");
        System.out.println("-------------------");
        //释放
        semaphore.release();
    }

    public static void main(String[] args) {
        MutexPrint mutexPrint = new MutexPrint();
        int count = 0;
        for(;;){
            if(count==10){
                break;
            }
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                mutexPrint.print("hello world");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            ).start();
            count++;
        }
    }
}
