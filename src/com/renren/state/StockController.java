package com.renren.state;

/**
 * Created by Administrator on 2017/9/22.
 */
public class StockController {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String doApprove(){
       return state.approve();
    }

    public String doWaitProcee(){
        setState(new StockWaitState());
        return doApprove();
    }

    public static void main(String[] args) {
        StockController context = new StockController();
        String result = context.doWaitProcee();
        System.out.println(result);
    }
}
