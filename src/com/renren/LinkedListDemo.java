package com.renren;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/9/14.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
       /* List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        List<String> lists =  Collections.synchronizedList(list);
*/
        ArrayList<Integer> list = new ArrayList<>(10);
        int count=0;
        for(;;){
            if(count>=20){
                break;
            }
            list.add(count);
            count++;
        }
        System.out.println(list.size());

    }

}
