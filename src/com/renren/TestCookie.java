package com.renren;

import org.jasig.cas.client.util.DesUtils;

/**
 * Created by Administrator on 2017/9/7.
 */
public class TestCookie {
    public static void main(String[] args) throws Exception {
        String userValue = "1504778973647";
        String time = "7589276105ab939124f39291dd2fe8ef";
        DesUtils des = new DesUtils("51fenqicookiekey" + time);
        System.out.println(des);
        System.out.println(des.decrypt(userValue));
    }
}
