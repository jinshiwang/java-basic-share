package com.renren;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/9/12.
 */
public class TestThread {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(es);
        for(int i=0;i<4;i++){
            ThreadCount  tc = new ThreadCount(i+1);
            cs.submit(tc);
        }
       // es.shutdown();
        int total = 0;
        for(int i=0;i<4;i++){
            try {
                total+=cs.take().get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println(total);
    }
}
