package com.renren;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/9/7.
 */
public class FastFail {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<String, String> ();
        hashMap.put("t1","test1");
        hashMap.put("t2","test2");
        hashMap.put("t3","test3");
        hashMap.put("t4","test4");
        hashMap.put("t5","test5");

        IteratorMap iteratorMap = new IteratorMap(hashMap);
        Thread thread = new Thread(iteratorMap);
        Collection<String>  values =  hashMap.values();
        Iterator<String>  iters =  values.iterator();
        thread.start();
        for(;iters.hasNext();){
            System.out.println(iters.next());
            TimeUnit.MILLISECONDS.sleep(1000);
        }


    }
}


class IteratorMap implements Runnable{
    ConcurrentHashMap<String, String> hashMap;
    public IteratorMap(ConcurrentHashMap<String, String> hashMap){
        this.hashMap = hashMap;
    }
    public void run(){
        System.out.println("remove"+hashMap.remove("t1"));
    }
}
