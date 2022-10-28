package dataStructures;
import java.util.ArrayList;
import java.util.EmptyStackException;

//Implentation of a dynamic stack
public class Stack {
    private ArrayList<Integer> list = null;



    //create a new stack using an arraylist as a container
    public Stack(){
        list = new ArrayList<>();
    }

   
    /**
     * 
     * @param val the value we want to add to the stack
     * @return the value that we just added to the stack
     */
    public int push(int val){
        list.add(val);
        return val;
    }

    /**
     * 
     * @return value removed from the top or -1 if stack is empty along with consoleMsg: StackEmptyException
     */
    public int pop(){
        
        if(!list.isEmpty()){
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        else{
           return error();
        }
        
    }

    /**
     * 
     * @return the value at the top of the stack or -1 if stack is empty along with consoleMsg: StackEmptyException
     */
    public int peek(){

        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }else{
            return error();
            
        }
    }

    /**
     * 
     * @return true if stack is empty
     */
    public boolean empty(){
        if(list.isEmpty()) return true;
        else return false;
    }

    /**
     * 
     * @param val value to search for
     * @return the position of the value found starting from the top of the stack. The top is considered 1 
     */
    public int search(int val){

        if(!list.isEmpty()){
            int pos =1;

            for(int i = list.size()-1; i >= 0; i--){
                if(list.get(i) == val) return pos;
                else pos++;
            }
        }

        return -1;
    }
    

    //Simple error msg 
    public int error(){
        System.out.println("EmptyStackException:");
        return -1;
    }
}
