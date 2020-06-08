package org.fscotto.interview.demo;

import java.util.*;

public class InterviewQuestionsC1 {

    public static boolean isUniqueChars(final String str) {
        if (str == null || "".equals(str))
            return false;

        if (str.length() > 128)
            return false;

        final boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i);
            if (charSet[val])
                return false;
            charSet[val] = true;
        }
        return true;
    }

    public static boolean permutation(final String s, final String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;

        final int[] letters = new int[128];
        final char[] sArray = s.toCharArray();
        for (final char c : sArray)
            letters[c]++;

        for (int i = 0; i < t.length(); i++) {
            final int c = t.charAt(i);
            letters[c]--;
            if (letters[c] < 0)
                return false;
        }
        return true;
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;
        if (trueLength < str.length)
            str[trueLength] = '\0';
        for (int i = trueLength - 1; i >= 0; --i) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static boolean palindrome(String str) {
        
        return false;
    }

}
