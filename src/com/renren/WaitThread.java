package com.renren;

/**
 * Created by Administrator on 2017/9/11.
 */
public class WaitThread extends Thread {

    Result lock = null;
    WaitThread(Result obj){
        lock = obj;
    }
    public void run(){
        System.out.println("执行第一个线程");
        synchronized (lock){
            try {
                TimeOut timeOut = new TimeOut(lock);
                timeOut.start();
                lock.wait();
            }catch(InterruptedException ex) {/*ignore*/}
            System.out.println("等待第二个线程处理结果线程"+lock.getResult());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Result lock = new Result();
        WaitThread thread = new WaitThread(lock);
        thread.start();
    }
}

class TimeOut extends Thread {
    int sleepTime = 10000;
    Result lock = null;
    public TimeOut(Result obj) {
        lock = obj;
    }

    public void run() {
        try {
            synchronized (lock){
                System.out.println("do handler");
                String  str = "music init";
                lock.setResult(str);
                lock.notifyAll();
            }

        } catch(Exception ex) {/*ignore*/}
        System.out.println("B线程退出");
    }
}

class Result{
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
