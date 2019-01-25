package com.tomiyo.algorithm;

import java.util.Scanner;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2018-12-21 16:10
 **/
public class DecimalLength {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 整数1-9999999");

        while (true){

            int in = scanner.nextInt();

//            if(in< 0 || in >9999999){
//                System.out.println("Invalide decimal number");
//                continue;
//            }
            int count =1;
            int temp=in;
            while ((temp=temp/10) >0){
                count ++;
            }

            System.out.println("整数：" + in +"   的位数为： "+count);
        }

    }

}
