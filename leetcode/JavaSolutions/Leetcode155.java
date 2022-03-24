package leetcode.javaSolutions;
import java.util.ArrayList;


public class Leetcode155 {
    ArrayList<Integer> list = null;
    int min = Integer.MAX_VALUE;
    
    public Leetcode155() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        min = Math.min(min,val);
    }
    
    
    //{-2 , 0 ,  -3 ,}
    public void pop() {
          list.remove(list.size()-1);
         int tempMin = Integer.MAX_VALUE;
        
        for(int num : list){
            tempMin = Math.min(tempMin,num);
        }
        
        min = tempMin;
    }
    
    public int top() {
        return list.get(list.size()-1);        
    }
    
    public int getMin() {
        return min;
    }
}
