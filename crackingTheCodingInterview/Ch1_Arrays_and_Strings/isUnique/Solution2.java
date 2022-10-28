package crackingTheCodingInterview.Ch1_Arrays_and_Strings.isUnique;

public class Solution2 {
    public static boolean isUniqueChars(String s) {
        if(s.length() > 26 || s.equals("") || s == null) return false;
        boolean[] values = new boolean[128];

        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if(values[val]) return false;
            values[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle" , "" , "a"};
        for(String word : words) {
            System.out.println(word + " contains unique characters " + isUniqueChars(word));
        }
    }
}
