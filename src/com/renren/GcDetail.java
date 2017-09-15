package com.renren;

import org.junit.Test;

import java.lang.ref.SoftReference;

/**
 * Created by Administrator on 2017/9/7.
 */
public class GcDetail {
    @Test
   public void testStrongReference0() {
        System.out.println("**********强引用测试（放一个4M的数组，触发GC）**********");
        byte[] bytes = new byte[4 *1024*1024];
        bytes = null;
        System.gc();
   }

    /**
     * @author 五月的仓颉http://www.cnblogs.com/xrq730/p/7082471.html
     */
    @Test
    public void testSoftReference0() {
        String str = new String("1233");
        System.out.println("**********软引用测试**********");

        SoftReference<byte[]> sr0 = new SoftReference<byte[]>(new byte[4 * 1024*1024]);
        SoftReference<byte[]> sr1 = new SoftReference<byte[]>(new byte[4 * 1024*1024]);
        SoftReference<byte[]> sr2 = new SoftReference<byte[]>(new byte[4 * 1024*1024]);
        SoftReference<byte[]> sr3 = new SoftReference<byte[]>(new byte[4 * 1024*1024]);
        SoftReference<byte[]> sr4 = new SoftReference<byte[]>(new byte[4 * 1024*1024]);
        SoftReference<byte[]> sr5 = new SoftReference<byte[]>(new byte[4 * 1024*1024]);

        System.out.println(sr0.get());
        System.out.println(sr1.get());
        System.out.println(sr2.get());
        System.out.println(sr3.get());
        System.out.println(sr4.get());
        System.out.println(sr5.get());
    }
}
