package com.renren;

/**
 * Created by Administrator on 2017/9/11.
 */
public class ThreadDemo {
    public static void main(String argv[])throws InterruptedException{
        ThreadA ta=new ThreadA();
        ta.setName("ThreadA");
        ta.start();
        ThreadA ta1=new ThreadA();
        ta1.setName("ThreadB");
        ta1.start();
      //  Thread.sleep(2000);
      //  System.out.println(ta.getName()+"正在被中断...");
      //  ta.interrupt();
        ta.join();
        ta1.join();
        Thread.sleep(2000);
        System.out.println("ta.isInterrupted()="+ta.isInterrupted());
    }
}
