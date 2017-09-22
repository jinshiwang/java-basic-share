package com.renren.state;

/**
 * Created by Administrator on 2017/9/22.
 */
public class StockWaitState implements State{

    @Override
    public String approve() {
        return "wait Stock";
    }
}
