package com.brutech.entity;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        String textClean = text.toLowerCase().replaceAll("[^a-za]", "");
        Stack<String> strStack = new Stack<>();
      for(char c : textClean.toCharArray()){
        strStack.push(String.valueOf(c));
      }
       // System.out.println(strStack);
        String reversed = "";

       // Iterator<String> iterator = strStack.iterator();
    while(!strStack.isEmpty()){
        reversed += strStack.pop();
    }
    //System.out.println(reversed);
        return reversed.equals(textClean);
    }
}