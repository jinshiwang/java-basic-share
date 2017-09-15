package com.renren;

import org.junit.Test;

/**
 * Created by Administrator on 2017/9/13.
 */
public class GcTest {

    /**
     * 1M
     */
    private static final int _1MB = 1024 * 1024;

    @Test
    public void testStrongReference(){
        System.out.println("**********强引用测试（放一个4M的数组，触发GC）**********");

        byte[] bytes = new byte[4 * _1MB];
        bytes = null;
        // 手动触发GC
        System.gc();
    }
}
