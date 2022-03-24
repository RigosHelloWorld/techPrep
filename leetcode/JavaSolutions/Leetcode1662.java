package leetcode.javaSolutions;

public class Leetcode1662 {
        /*
    We know that the length can vary and the words can still be equal
    
    ORDER MATTERS: abc ! == acb
    
    First Thought 
    create two string buffers buff1, buff2
    
    loop through word1 and append each char to buff1 same thing for word2/buff2
    
    call the .equals method to see if there the same
    
    */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // word1 = {a,b,c} word2 = {a,bc}
        
        //assume strings are not equal
        boolean isEqual = false;
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        
        for(String word : word1){
            for(char c : word.toCharArray()){
                buffer1.append(c);
            }
        }
        
        for(String word : word2){
            for(char c : word.toCharArray()){
                buffer2.append(c);
            }
        }
        
        System.out.println("Buf1: " + buffer1.toString());
        System.out.println("Buf2: " + buffer2.toString());


        
        
        if(buffer1.toString().equals(buffer2.toString())) return true;
        
        return isEqual;
    }
}
