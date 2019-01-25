package com.tomiyo.algorithm;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2018-12-20 21:01
 **/
public class Test2 {

    public static void main(String[] args){

        int[] array = {3,4,1,1,2,1};

       int step = jump(array);
       System.out.println(step);
    }


    public static int jump(int[] A) {
        if(A==null||A.length==0)
            return 0;
        int maxcover =0;
        int step = 0;
        int lastcover = 0;
        for(int i=0;i<=maxcover && i<A.length;i++){
            if(i>lastcover){
                step++;
                lastcover = maxcover;
            }
            if(A[i]+i>maxcover){
                maxcover = A[i]+i;
            }
        }
        if(maxcover < A.length-1)
            return 0;
        return step;
    }

}
