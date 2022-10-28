package crackingTheCodingInterview.Ch1_Arrays_and_Strings.isPermutation;

public class Solution2 {
    
    public static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) return false;

        //Assuming ascii characters
        int[] letters = new int[128];
        
        for(int i = 0; i < a.length(); i++) {
            // a.charAt(i) = 'a' == 97 ---> letters[97] increase by 1;
            letters[a.charAt(i)]++;
        }
        for(int i = 0; i < b.length(); i++) {
            letters[b.charAt(i)]--;
            if(letters[b.charAt(i)] < 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};

        for(String[] pair : pairs) {
            boolean anagram = isPermutation(pair[0], pair[1]);
            System.out.println(pair[0] + ", " + pair[1] + " : " + anagram);
        }
    }
}
