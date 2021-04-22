package org.fscotto.interview.demo;

public class InterviewQuestionsC1 {

    public static boolean isUniqueChars(final String s) {
        if (s == null || "".equals(s))
            return false;

        if (s.length() > 128)
            return false;

        final boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); ++i) {
            int val = s.charAt(i);
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

    public static void replaceSpaces(char[] chars, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;
        if (trueLength < chars.length)
            chars[trueLength] = '\0';
        for (int i = trueLength - 1; i >= 0; --i) {
            if (chars[i] == ' ') {
                chars[index - 1] = '0';
                chars[index - 2] = '2';
                chars[index - 3] = '%';
                index -= 3;
            } else {
                chars[index - 1] = chars[i];
                index--;
            }
        }
    }

    public static boolean palindrome(String s) {
        final String str = s.toLowerCase();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
