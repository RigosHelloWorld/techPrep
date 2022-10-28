package dataStructures;
import java.util.ArrayList;
import java.util.EmptyStackException;

//Implentation of a dynamic stack
public class Stack <T>{
    private ArrayList<T> list = null;

    //create a new stack using an arraylist as a container
    public Stack(){
        list = new ArrayList<>();
    }

   
    /**
     * 
     * @param val the value we want to add to the stack
     * @return the value that we just added to the stack
     */
    public T push(T val){
        list.add(val);
        return val;
    }

    /**
     * 
     * @return value removed from the top or -1 if stack is empty along with consoleMsg: StackEmptyException
     * @throws EmptyStackException 
     */
    public T pop() {
        
        if(!list.isEmpty()){
            T val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        else{
           throw new EmptyStackException();
        }
        
    }

    /**
     * 
     * @return the value at the top of the stack or -1 if stack is empty along with consoleMsg: StackEmptyException
     */
    public T peek() {

        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }else{
            throw new EmptyStackException();
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
    public int search(T val){

        if(!list.isEmpty()){
            int pos =1;

            for(int i = list.size()-1; i >= 0; i--){
                if(list.get(i) == val) return pos;
                else pos++;
            }
        }

        throw new EmptyStackException();
    }
}
