package com.renren;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/9/7.
 */
public class ForDemo {

    public static void main(String[] args) throws InterruptedException{
        int count = 0;
        for(;;){
            if(count==10){
                System.out.println("end");
                break;
            }
            TimeUnit.SECONDS.sleep(1);
            count++;
        }
        System.out.println("shifou");

    }
}
