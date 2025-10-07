package com.codescene.calculator2;

public class ConditionalExample {

    /**
     * This is an example on documentation. Modifying docs should never impact 
     * coverage: docs are non-executable lines.
     * @param num (a great name for an argument, isn't it?)
     * @return Nothing. This method is all about side-effects.
     */
    public void checkNumber(int num) {
        if (num > 0) {
            // Let's add a comment inside the method body.
            // We'll use this comment block as a modification target in 
            // various PRs to illustrate how comments are filtered out from 
            // the coverage checks.
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        }

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public String categorizeString(String str) {
        String result = "";

        if (str.length() > 5) {
            result += "Long ";
        } else {
            result += "Short ";
        }

        if (str.matches(".*\\d.*")) {
            result += "and contains numbers";
        } else {
            result += "and contains only letters";
        }

        return result;
    }

    public int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}

