package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
// Checks for single instances of letter
        int counter = 0;

        // Checks all substrings using StringBuilder
        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String forward = input.substring(i, j);
                String backward = new StringBuilder(forward).reverse().toString();
                if (forward.equals(backward)) {
                    counter++;
                }

            }
        }

        return counter;
    }
}
