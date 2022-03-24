package leetcode.javaSolutions;

import java.util.HashSet;
import java.util.Set;

public class Leetcode1684{
    /*
    Problem Statement we have a string allowed with at least one Distact character
    and an array of words 
    
    Each character in EVERY word must appreat in the string allowed 
    
    we will be returning a count of the number of allowed words from the array words
    
    EX.
    WORDS[] = "avbbbbbb", "a" , "b" , "c"  allowed = "abv"   count = 3
    
    Solution:
    we will take the string allowed and store each character in a hashset.
    to do this we need to loop through each character in the string and add it to the hashset
    
    once this is done we will then loop through each word and check if the characters are part of the hashset 
    
    if they all are we increment the count 
    
    if we find a character that is not in the hashset go to the next word
    
    edge cases:
    
    
    
    */
    
    
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedChars = new HashSet<>();
        int count =0;
        
        for(char c : allowed.toCharArray()) allowedChars.add(c);
        
        
        for(String word: words){
            //assume the word is correct
            boolean isAllowed = true;
            for(char c : word.toCharArray()){
                
                if(!allowedChars.contains(c)){
                    isAllowed = false;
                    break;
                }
            }
            
            if(isAllowed) count++;
        }
        
        
        System.out.println(allowedChars);
        
        return count;
    }
}