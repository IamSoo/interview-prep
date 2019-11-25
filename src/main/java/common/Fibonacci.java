package common;

import java.util.List;

public class Fibonacci {

    /**
     * 1 1 2 3 5 8
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacciByRecurssion(5));
        System.out.println(fibonaciiByDP(n));
    }

    public static int fibonacciByRecurssion(int n){
        if(n <= 1){
            return 1;
        }else{
            return fibonacciByRecurssion(n-1) + fibonacciByRecurssion(n-2);
        }
    }

    public static int fibonaciiByDP(int n){
        int f[] = new int[ n + 2] ;
        if(n <= 1 ){
            f[n] = 1;
        }else{
            f[n] = fibonaciiByDP(n-1) + fibonaciiByDP(n-2);
        }
        return f[n];

    }

}
