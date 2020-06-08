package org.fscotto.interview.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterviewQuestionsC1Test {

    @Test
    void isUniqueCharsTests() {
        assertFalse(InterviewQuestionsC1.isUniqueChars(null));
        assertFalse(InterviewQuestionsC1.isUniqueChars(""));
        assertTrue(InterviewQuestionsC1.isUniqueChars("a"));
        assertTrue(InterviewQuestionsC1.isUniqueChars("abc"));
        assertFalse(InterviewQuestionsC1.isUniqueChars("anna"));
        assertFalse(InterviewQuestionsC1.isUniqueChars("birbante"));
        assertFalse(InterviewQuestionsC1.isUniqueChars(getStringAllASCII()));
    }

    private String getStringAllASCII() {
        StringBuilder sb = new StringBuilder(130);
        for (int i = 0; i < 129; ++i)
            sb.append((char) i);
        return sb.toString();
    }

    @Test
    void isPermutationOfTests() {
        assertFalse(InterviewQuestionsC1.permutation(null, "BAC"));
        assertFalse(InterviewQuestionsC1.permutation("BAC", null));
        assertFalse(InterviewQuestionsC1.permutation(null, null));
        assertTrue(InterviewQuestionsC1.permutation("", ""));
        assertTrue(InterviewQuestionsC1.permutation("ABC", "BAC"));
        assertTrue(InterviewQuestionsC1.permutation("BAC", "ABC"));
        assertTrue(InterviewQuestionsC1.permutation("BAC", "CAB"));
    }

    @Test
    void replaceSpacesTests() {
        final char[] str = "Mr John Smith    ".toCharArray();
        InterviewQuestionsC1.replaceSpaces(str, 13);
        assertEquals("Mr%20John%20Smith", new String(str));
    }



}
