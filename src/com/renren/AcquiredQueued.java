package com.renren;

/**
 * Created by Administrator on 2017/9/8.
 */
public class AcquiredQueued {

    public static void main(String[] args) {
        //for each
        int count = 0;
        for(;;){
            if(count==10){
                System.out.println("------"+count);
                return;
            }
           count++;
        }
    }
}
