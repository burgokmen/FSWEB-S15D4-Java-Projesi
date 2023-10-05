package com.brutech.entity;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
        System.out.println("-------------------------");
        System.out.println(decimalToBinary(24));
        System.out.println(decimalToBinary(0));
        System.out.println(decimalToBinary(2));
        System.out.println(decimalToBinary(3));
        System.out.println(decimalToBinary(9999));
        System.out.println(decimalToBinary(-24));

    }

  /*  public static boolean checkForPalindrome(String text) {
        String textClean = text.toLowerCase().replaceAll("[^a-za]", "");
        Stack<String> strStack = new Stack<>();
      for(char c : textClean.toCharArray()){
        strStack.push(String.valueOf(c));
      }
       // System.out.println(strStack);
        StringBuilder reversed = new StringBuilder();

       // Iterator<String> iterator = strStack.iterator();
    while(!strStack.isEmpty()){
        reversed.append(strStack.pop());
    }
    //System.out.println(reversed);
        return reversed.toString().equals(textClean);
    }*/

        public static boolean checkForPalindrome(String text) {
        String textClean = text.toLowerCase().replaceAll("[^a-za]", "");
        Stack<String> strStack = new Stack<>();
        for(char c : textClean.toCharArray()){
            strStack.push(String.valueOf(c));
        }
        Queue<String> strQueue = new LinkedList<>();
        //System.out.println(strStack);
        while(!strStack.isEmpty()){
            strQueue.add(strStack.pop());
        }


        //System.out.println(strQueue);

        return true;

         }

      /*   public static Map<Integer, String> decimalToBinary(int num){
             Map<Integer, String> binary = new TreeMap<>(Comparator.reverseOrder());
             Integer [] keys = [9,8,7,6,5,4,3,2,1,0]
             switch ()

             return binary;
         }*/

    public static String decimalToBinary(int decimal) {
        decimal = Math.abs(decimal);

        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }
        return binary.toString();
    }
}