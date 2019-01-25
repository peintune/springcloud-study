package com.tomiyo.algorithm.code;

/**
 * @description: 反转一个只有3位数的整数
 * @author: He Kun
 * @create: 2019-01-25 10:36
 **/
public class Test5 {

    public static void main(String[] args){
        int number = 893;
        System.out.println(execute(number));

    }

    public static int execute(int number){
        String result ="";
        while (number>0){
            int d = number % 10;
            result+=d;
            number = number /10;
        }

        return Integer.parseInt(result);
    }
}
