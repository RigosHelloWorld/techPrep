package leetcode.javaSolutions;

import java.util.StringTokenizer;

public class Leetcode824 {
    public static String toGoatLatin(String sentence) {
        StringTokenizer tokenz = new StringTokenizer(sentence);
        String[] str = sentence.split(" ");
        StringBuilder sentenceRevised = new StringBuilder();
        int count = 0;
        while(tokenz.hasMoreTokens()) {
            String s = tokenz.nextToken();

            if(isFirstLetterVowel(s)) {
                appendToSentence(sentenceRevised, s + "ma");
            }
            else {
                char c = s.charAt(0);
                appendToSentence(sentenceRevised, s.substring(1,s.length()) + c + "ma");
            }
            append(sentenceRevised, ++count, 'a');
        }

        return sentenceRevised.toString();
    }

    public static void appendToSentence(StringBuilder s , String appendable) {
        if(s.length() == 0)
            s.append(appendable);
        else {
            s.append(" ");
            s.append(appendable);
        }
    }

    public static void append(StringBuilder s , int n, char c) {
        for(int i = 0 ; i < n; i++) {
            s.append(c);
        }
    }

    public static boolean isFirstLetterVowel(String s) {
        char c = s.toLowerCase().charAt(0);

        switch(c) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
}

/*
 * You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
For example, the word "apple" becomes "applema".
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
Return the final sentence representing the conversion from sentence to Goat Latin.

 

Example 1:

Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 */