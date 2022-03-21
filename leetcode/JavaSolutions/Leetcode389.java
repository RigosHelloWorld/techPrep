package leetcode.javaSolutions;

class Leetcode389 {
    
    /*
    s = "" length 0         return tcharAT(0)
    s = "A"     t = "Ab"    return 'b'
    
    
    
    we can add all the ascii values in each string and return the differance in character value
    
    
    */
    public char findTheDifference(String s, String t) {
        if(s.length() ==0) return t.charAt(0);
        
        
        int sNum =0;
        int tNum =0;
        
        for(int i=0; i < s.length(); i++){
            sNum += (int)s.charAt(i);
            tNum += (int)t.charAt(i);
        }
        
        tNum += t.charAt(t.length() -1);
        
        
        return (char) (tNum - sNum);
        
    }
}