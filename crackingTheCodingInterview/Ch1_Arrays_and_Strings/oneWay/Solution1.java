package crackingTheCodingInterview.Ch1_Arrays_and_Strings.oneWay;

/**
 * Problem:
 * There are three types of edits that can performed on strings:
 * insert a character, remove a charachter, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero
 * edits) away.
 *
 * Example:
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 *
 */
public class Solution1 {

    private static boolean oneEdit(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1)
            return false;
        if (str1.length() == str2.length())
            return oneEditReplace(str1, str2);

        else if (str1.length() + 1 == str2.length())
            return oneEditInsert(str1, str2);
        else if (str1.length() - 1 == str2.length())
            return oneEditInsert(str2, str1);
        return false;
    }

    // str1 = abcd, str2 = abdd ---> return false
    private static boolean oneEditReplace(String str1, String str2) {
        boolean isDiff = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (isDiff) return false;
                isDiff = true;
            }
        }
        return true;
    }

    private static boolean oneEditInsert(String str1, String str2) {
        int index1 = str1.length();
        int index2 = str2.length();

        while (index2 < str2.length() && index1 < str1.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2)
                    return false;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] tests = { { "a", "b", "true" },
                { "", "d", "true" },
                { "d", "de", "true" },
                { "pale", "pse", "false" },
                { "acdsfdsfadsf", "acdsgdsfadsf", "true" },
                { "acdsfdsfadsf", "acdsfdfadsf", "true" },
                { "acdsfdsfadsf", "acdsfdsfads", "true" },
                { "acdsfdsfadsf", "cdsfdsfadsf", "true" },
                { "adfdsfadsf", "acdfdsfdsf", "false" },
                { "adfdsfadsf", "bdfdsfadsg", "false" },
                { "adfdsfadsf", "affdsfads", "false" },
                { "pale", "pkle", "true" },
                { "pkle", "pable", "false" } };
        
        
        for(String[] test : tests) {
            System.out.println(test[0] + ", " + test[1] + ", " + " Expected: " 
                + test[2] + " Result: " + oneEdit(test[0], test[1]));
        }
    }
}
