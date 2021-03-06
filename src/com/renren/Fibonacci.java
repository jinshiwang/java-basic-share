package com.renren;

/**
 * Created by Administrator on 2017/9/6.
 */
public class Fibonacci {

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Please input this fibonacci n:");
       // int n = scanner.nextInt(); // 假设输入为大于零的整数

        System.out.println(fibonacciNormal(48));

        /*int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += fibonacci(i);
        }
        System.out.println(sum);*/
    }

    // 递归实现方式
    public static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // 递推实现方式
    public static int fibonacciNormal(int n){
        if(n <= 2){
            return 1;
        }
        int n1 = 1, n2 = 1, sn = 0;
        for(int i = 0; i < n - 2; i ++){
            sn = n1 + n2;
            n1 = n2;
            n2 = sn;
        }
        return sn;
    }
}
