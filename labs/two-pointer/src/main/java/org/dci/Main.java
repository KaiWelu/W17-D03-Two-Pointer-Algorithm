package org.dci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] problemOne = {"h", "e", "l", "l", "o"};
        System.out.println("Problem 1:");
        System.out.println("Input: ");
        System.out.println(Arrays.toString(problemOne));
        System.out.println("Output: ");
        System.out.println(Arrays.toString(reverseArray(problemOne)));


        Integer[] problemTwo = {3, 2, 2, 3, 4, 5, 3};
        System.out.println("Problem 2: ");
        System.out.println("Input:");
        System.out.println(Arrays.toString(problemTwo));
        System.out.println("Output");
        problemTwo.
        System.out.println(Arrays.toString(problemTwo));

        /* i know this is supposed to be a String but they are immutable in Java
         so I skipped the conversion to array step */
        String[] problemThree = {"I","c","e","C", "r", "E", "A", "m"};
        System.out.println("Problem 3: ");
        System.out.println("Input: ");
        System.out.println(Arrays.toString(problemThree));
        System.out.println("Output: ");
        System.out.println(Arrays.toString(reverseVowels(problemThree)));


    }

    public static String[] reverseArray(String[] inputArray) {
        int left = 0;
        int right = inputArray.length - 1;

        while(left < right) {
            String buffer = inputArray[right];
            inputArray[right] = inputArray[left];
            inputArray[left] = buffer;
            left++;
            right--;
        }

        return  inputArray;
    }

    public static String[] reverseVowels(String[] inputArray) {
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a","e","i","o","u", "A", "E","I", "O", "U"));

        int left = 0;
        int right = inputArray.length - 1;

        while(left < right) {

            if(!vowels.contains(inputArray[left])) {
                left++;
                continue;
            }

            if(!vowels.contains(inputArray[right])) {
                right--;
                continue;
            }


            String buffer = inputArray[right];
            inputArray[right] = inputArray[left];
            inputArray[left] = buffer;
            left++;
            right--;
        }


        return inputArray;
    }
}