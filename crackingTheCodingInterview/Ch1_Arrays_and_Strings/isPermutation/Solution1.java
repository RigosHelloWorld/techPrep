package crackingTheCodingInterview.Ch1_Arrays_and_Strings.isPermutation;

import java.util.Arrays;

public class Solution1 {
    
    /**
     * We are assuming that "god______" is diff from "dog"
     * @param a String a 
     * @param b String b
     * @return true string b is a permutation of string a
     */
    public static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) return false;
        return sort(a).equals(sort(b));
    }

    private static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};

        for(String[] pair : pairs) {
            boolean anagram = isPermutation(pair[0], pair[1]);
            System.out.println(pair[0] + ", " + pair[1] + " : " + anagram);
        }
    }
}
