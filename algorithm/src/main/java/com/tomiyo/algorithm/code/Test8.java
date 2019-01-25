package com.tomiyo.algorithm.code;

/**
 * @description: 数组排序
 * @author: He Kun
 * @create: 2019-01-25 11:25
 **/
public class Test8 {

    public static void main(String[] args){
       int[] array = {1,2,2,5,1,3,2,4,3,10,6};
        System.out.println(execute2(array));
    }

    //选择排序，每次选最小的放到前面，
    public static int[] execute(int[] array){

        for(int i= 0; i< array.length;i++){

            int tmp ;

            for(int j =i+1; j<array.length;j++) {

                if(array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return  array;
    }

    //冒泡，最大/最小依次比较放到最后
    public static int[] execute2(int[] array){

        for(int i= array.length-1; i>= 0;i--){
            int tmp;
            for(int j =0;j<i;j++){
                if(array[j]>array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        return  array;
    }


}
