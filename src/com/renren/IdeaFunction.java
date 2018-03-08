package com.renren;

public class IdeaFunction {

    private  IdeaFunction(){};

    static class IdeaFunctionHolder{
       private static IdeaFunction ideaFunction = new IdeaFunction();
    }

    public static IdeaFunction  getInstance(){
        return IdeaFunctionHolder.ideaFunction;
    }

    public static void main(String[] args) {
        System.out.println("append something");
        IdeaFunction ideaFunction = IdeaFunction.getInstance();
        System.out.println("new ideaFunction "+ideaFunction);
    }
}
