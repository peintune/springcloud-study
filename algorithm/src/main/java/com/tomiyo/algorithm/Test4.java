package com.tomiyo.algorithm;

import org.junit.Test;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2018-12-24 10:51
 **/
public class Test4 {


         @Test
         public void test1(){
            int count = digitCounts(0, 19100980);
            System.out.println(count);
         }

        /**
         * @param k: An integer
         * @param n: An integer
         * @return: An integer denote the count of digit k in 1..n
         */
        public int digitCounts(int k, int n) {
            // write your code here
            int count = 0;
            for(int i=0;i<=n; i++){
                count =count+ getCountOfNumber(i+"", (k+"").charAt(0));
            }

            return count;
        }

        public int getCountOfNumber(String number, char value ){

            int count = 0;

            if(!number.contains(value+"")){
                return 0;
            }

            for(int i =0; i< number.length();i++){

                if(value == number.charAt(i)){
                    count ++;
                }
            }

            return count;
        }
}

