class Solution {

    public int fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }





    public int fib(int n) {
        int fibonacciNum=fibo(n);
        return fibonacciNum;
        
    }
}