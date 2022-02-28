package HelperClasses;

import java.util.Arrays;
import java.util.Random;

public class MyArrays{
    private int[] numsArray;
    private int upperBound;
    private int size = 10;

   public  MyArrays(){
        numsArray = new int[size];
        upperBound = size;

        
        setNumsArray();
    }



    public MyArrays(int size, int upperBound){

        this.upperBound = upperBound;
        numsArray = new int[size];

        setNumsArray();
        
    }


    private void setNumsArray(){
        Random rand = new Random();
      
        for(int i=0; i < numsArray.length; i++){
            numsArray[i] = rand.nextInt(upperBound);
        }
    }

   
    @Override
    public String toString(){
        
        return Arrays.toString(numsArray);
    }
    
}