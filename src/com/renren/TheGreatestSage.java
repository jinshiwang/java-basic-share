package com.renren;

import java.io.IOException;

/**
 * Created by Administrator on 2017/9/13.
 */
public class TheGreatestSage {

    private Monkey monkey = new Monkey();

    public void change() throws IOException, ClassNotFoundException {
        //克隆大圣本尊
        monkey.setHeight(12);
        Monkey copyMonkey = (Monkey) monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate()+"身高度"+monkey.getHeight());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthDate()+"身高度"+copyMonkey.getHeight());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }

    public static void main(String[]args) throws IOException, ClassNotFoundException {
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}
