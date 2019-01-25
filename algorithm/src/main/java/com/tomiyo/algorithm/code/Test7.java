package com.tomiyo.algorithm.code;

/**
 * @description: 斐波纳契数列中第 N 个数
 * @author: He Kun
 * @create: 2019-01-25 10:57
 **/
public class Test7 {

    public static void main(String[] args){
        char s = 'd';
        char m = 93;
        char x = '钟';
        System.out.println(execute2(42));

    }

    public static int execute(int  n){
        if(n == 1)return 0;

        if(n == 2)return 1;

        return execute(n-1)+execute(n-2);
    }

    public static int execute2(int  n){
        if(n == 1)return 0;

        if(n == 2)return 1;

        int before1 =0,before2 =1;
        int current = 0;
        for(int i=3; i<= n;i++){
             current = before1 + before2;
            before1 = before2;
            before2 = current;
        }
        return  current;
    }
}
