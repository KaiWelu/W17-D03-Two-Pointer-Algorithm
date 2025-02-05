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

    public static String[] reverseVowels(String[] input) {
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a","e","i","o","u", "A", "E","I", "O", "U"));

    }
}