package com.example.test;

//实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
//蛮力法解决，通过递归的方法，解决方式是多次的乘n和除n。
public class Test50 {
    public double myPow(double x, int n) {
        if(n==0)//不以1为基准，而是以0为基准，作为结束递归中的递的标识符。
            return 1;
        else if(n>0)//当n大于0时，多次乘n
            return x*myPow(x,n-1);
        else//当n<0时，1多次除以n
            return myPow(x,n+1)/(double)x;
    }

    public static void main(String[] args)
    {
        Test50 test = new Test50();
        System.out.println(test.myPow(5.0,-5));
    }

}
