package com.renren;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2017/9/12.
 */
public class ThreadCount implements Callable<Integer> {
    ThreadLocal count = new ThreadLocal();
    private int type;
    public ThreadCount(int type){
        this.type = type;
    }
    @Override
    public Integer call() throws Exception {
        if(type==1){
            System.out.println("C盘统计大小");
            return 1;
        }else if(type==2){
            System.out.println("D盘统计大小");
            return 2;
        }else if(type==3){
            System.out.println("E盘统计大小");
            return 3;
        }else if(type==4){
            System.out.println("F盘统计大小");
            return 4;
        }
        return null;
    }
}
