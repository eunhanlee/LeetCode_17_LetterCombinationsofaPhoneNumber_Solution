package org.example;

import java.util.*;
public class Solution {

    /**
     * An array that maps each digit to its corresponding letters on a phone keypad.
     */
    private static final String[] letterMap = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    /**
     * Generates all possible letter combinations of a given phone number.
     *
     * @param digits The string representing the phone number consisting of digits (0-9).
     * @return A list containing all possible letter combinations of the phone number.
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // If the input is null or empty, return an empty result list
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Start backtracking from the beginning
        backTracking(result, digits);
        return result;
    }

    /**
     * Helper function to start the backtracking process.
     *
     * @param result The list to store the generated letter combinations.
     * @param digits The string representing the phone number consisting of digits (0-9).
     */
    private void backTracking(List<String> result, String digits){
        backTrackingRecur(result, new StringBuilder(), digits, 0);
    }

    /**
     * Recursive backtracking function to generate letter combinations.
     *
     * @param result The list to store the generated letter combinations.
     * @param sb The StringBuilder to build the current letter combination.
     * @param digits The string representing the phone number consisting of digits (0-9).
     * @param index The current index of the digits string being processed.
     */
    private void backTrackingRecur(List<String> result, StringBuilder sb, String digits, int index) {
        // If we have reached the end of the digits string, add the current combination to the result list
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        // Get the current digit and its corresponding letters
        char digit = digits.charAt(index);
        String letters = letterMap[digit - '0'];

        // Iterate through each letter and append it to the StringBuilder
        for (char ch : letters.toCharArray()) {
            sb.append(ch);
            // Recur with the next digit's letters
            backTrackingRecur(result, sb, digits, index + 1);
            // Remove the last added letter to backtrack and try other letters
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

