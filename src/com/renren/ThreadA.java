package com.renren;

/**
 * Created by Administrator on 2017/9/11.
 */
public class ThreadA  extends Thread{
    private volatile boolean isInterrupted=false;
    int count=0;
    private Thread threadA = null;
    private static Object lock = new Object();
    public ThreadA(){
        System.out.println("拿到该引用");
        threadA = Thread.currentThread();
    }

    public void run(){
            synchronized (lock){
                System.out.println(getName()+"将要运行...");
                    System.out.println(getName()+"运行中"+count++);
                    try{
                        System.out.println(this+"===========");
                        sleep(5000);
                       // wait(1000);
                    }catch(InterruptedException e){
                        System.out.println(getName()+"从阻塞中退出...");
                        System.out.println("this.isInterrupted()="+this.isInterrupted());

                    }
                System.out.println(getName()+"已经终止!");
            }
    }

    public void interrupt(){
        isInterrupted = true;
        System.out.println("interrupt runing");
        super.interrupt();
    }
}
