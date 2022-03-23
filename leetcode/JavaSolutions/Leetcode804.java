package leetcode.javaSolutions;

import java.util.HashSet;
import java.util.Set;

public class Leetcode804 {
 
    //public String[] words = {"gin","zen","gig","msg"};
    
    /**
     * Problem Statement:
     * International Morse Code defines a standard encoding where each letter 
     * is mapped to a series of dots and dashes, as follows:
        'a' maps to ".-",
        'b' maps to "-...",
        'c' maps to "-.-.", and so on.
        For convenience, the full table for the 26 letters of the English alphabet is given below:
     */


    public int uniqueMorseCodeWords(String[] words){
        
        int asciiValueDif = 97;
        String[] morseArray = {".-",  "-...",  "-.-.",  "-..",  ".",  "..-.",      
                               "--.",   "....",   "..",  ".---",   "-.-",  ".-..",  "--",
                               "-.",   "---",  ".--.",  "--.-",  ".-.",  "...",  "-",  "..-",
                               "...-", ".--",  "-..-",  "-.--",    "--.."};


        Set<String> set = new HashSet<>();
        
        
        for(String word: words){
            StringBuffer buffer = new StringBuffer();
            for(char c : word.toCharArray()){
                buffer.append(morseArray[((int)c) - asciiValueDif]);
            }
            
            set.add(buffer.toString());
        }
        
        System.out.println(set.toString());
        
        return set.size() ;
    }
}
