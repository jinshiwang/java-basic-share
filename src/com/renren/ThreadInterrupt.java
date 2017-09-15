package com.renren;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/9/11.
 */
public class ThreadInterrupt extends Thread{
    private volatile Thread blinker;
    public void run()
    {
         blinker = Thread.currentThread();
        System.out.println("current name"+blinker.getName());
        try
        {
            sleep(50000);  // 延迟50秒
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
            System.out.println("线程已经退出!");
        }
    }

   public void interrupt(){
       super.interrupt();
       System.out.println("是否执行");
   }

    public static void main(String[] args) throws Exception
    {
      /*  ThreadInterrupt blinker = new ThreadInterrupt();
        blinker.start();
        System.out.println("在50秒之内按任意键中断线程!");
        System.in.read();
        blinker.interrupt();*/
        HashMap<String,String> map = new HashMap();
        map.put("123","123");
        map.put("456","456");
        Collection<String> collection =  map.values();
        for(Iterator<String> iter = collection.iterator();iter.hasNext();){
             String value =   iter.next();
             if(value.equals("456"))
                collection.remove(value);
             System.out.println(value);
        }
        System.out.println(collection.size());
        System.out.println(map.size());

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for(String str:list){
            if(str.equals("1"))
                list.remove("1");
        }
        System.out.println(list.size());
        //for()
        //thread.join();
    }
}
