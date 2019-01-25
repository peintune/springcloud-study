package com.tomiyo.algorithm.code;

import org.junit.Test;

/**
 * @description: 小写字符转大写
 * @author: He Kun
 * @create: 2019-01-25 10:42
 **/
public class Test6 {
    public static void main(String[] args){
        char s = 'd';
        char m = 93;
        char x = '钟';
        System.out.println(execute(s));

    }

    public static char execute(char  c){
           char d = (char) (c-32);

           return d;
    }
}
