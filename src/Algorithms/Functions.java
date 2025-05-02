package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Functions {

    public static String removeVowels(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }

    public static boolean isStrongPassword(String password) {
        return password.length() >= 8
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%^&*()].*");
    }

    public static boolean isPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static String stringCompressor(String input) {

        if (input.isEmpty()) {
            System.out.println("String is empty");
            return input;
        }
        StringBuilder test = new StringBuilder();
        int count = 1;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            while (i + 1 < chars.length && c == chars[i + 1]) {
                count++;
                i++;

            }

            test.append(c).append(count);
            count = 1;
        }

        if (test.length() < input.length()) {
            return test.toString();
        } else {
            System.out.println("Compressed string is not shorter");
            return input;
        }

    }

    public static String reverseWords(String sentence) {
        StringTokenizer input = new StringTokenizer(sentence, " ");
        StringBuilder result = new StringBuilder();
        while (input.hasMoreTokens()) {
            String word = input.nextToken();
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();

    }

    public static Map<String, Integer> wordFrequency(String paragraph) {
        Map<String, Integer> freq = new HashMap<>();
        StringTokenizer st = new StringTokenizer(paragraph, " ");
        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }

    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (seen.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String findLongestWord(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence);
        String longest = "";
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static List<String> reformatFixedWidth(String input) {
        return Arrays.asList(input.split("(?<=\\G.{10})"));
    }

}
