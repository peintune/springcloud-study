package com.tomiyo.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2018-12-21 15:23
 **/
public class Test3 {

    public static void main(String[] args){

        String str ="I love Shanghai";

        Stack<String> words = sort(str);


        while (!words.empty()){
            System.out.print(words.pop()+" ");
        }
//
//        for(String word: words){
//            System.out.print(word + " ");
//        }


    }


    public static Stack<String> sort(String str){

        int length = str.length();

        //Set words = new HashSet()<String>;

        List<String> words = new ArrayList<String>();
        String  word = "";

        Stack<String> stack = new Stack<String>();

        for(int i = 0; i< length; i++){

            char c = str.charAt(i);

            if(" ".equals(c+"")){
                words.add(word);
                stack.push(word);
                word = "";

            }else{
                word += c;
            }
        }

        if(""!=word){
            words.add(word);
            stack.add(word);
        }
        return stack;
    }

}


