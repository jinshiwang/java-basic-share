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
        IdeaFunction ideaFunction = IdeaFunction.getInstance();
        System.out.println("new ideaFunction "+ideaFunction);
    }
}
