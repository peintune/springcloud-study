package com.tomiyo.study.treenode;

import org.junit.Test;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2018-12-21 16:20
 **/
public class PositionMovie {


    @Test
    public void test1(){
        int a =1;
        int b =2;
        System.out.println(add_four(a,b ));
    }

    @Test
    public void test2(){
        System.out.println(trailingZeros(11));

    }

    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.

        // long number = 1L;
        // while(n-->1){
        //     number*=n;
        // }
//1X2X3X4X5 Xn

        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
        //  return number;
    }

    int add_four(int a, int b) {

        int cxor = 0;
        int cand = 0;
        System.out.println("a: "+ Integer.toBinaryString(a));
        System.out.println("b: "+ Integer.toBinaryString(b));

        while (b != 0) {
            cxor = a ^ b;
            System.out.println("cxor: "+ Integer.toBinaryString(cxor));
            cand = (a & b) << 1;
            System.out.println("cand: "+Integer.toBinaryString(cand));
            a = cxor;
            b = cand;
        }

        return cxor;
    }
}
