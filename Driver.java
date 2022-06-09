import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import algorithms.Algorithms;
import algorithms.Sorting;
import dataStructures.BinaryTree;
import dataStructures.SinglyLinkedList;
import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Driver {

        public static void main(String[] args) {
                int[] arr1 = {0,1,1,1,0};
                int[] arr2 = {0,1,0,1,0,1};
                int[] arr3 = {1,0};
                List<int[]> list = new ArrayList<>(Arrays.asList(arr1,arr2,arr3));

                

          


               System.out.println(count_the_ones(list));


        }// end of main function


        public static int count_the_ones(List<int[]> list){

                int num_ones =0;
                for(int i=0; i < list.size();i++){
                        for(int num: list.get(i)){
                                if(num == 1) num_ones++;
                        }
                }

                return num_ones;
        }
         

        public static List<String> mark_inventory(final String[] clothing_items){

                int num_sizes = 5;

                List<String> clothing_options = new ArrayList<>();


                /**
                 * BigO Notation:
                 * 
                 * In this example we have two loops the first loop iterates through the array (N) times with N being the size of our 
                 * clothing_items
                 * 
                 * The secound loop iterates whatever value num_sizes is.
                 * 
                 * IN OUR choosen example num_sizes =5 
                 * 
                 * This never changes and means the inner loop iterates 5 times for every N Strings
                 * 
                 * so this means
                 * 
                 * O(5N) = O(N)
                 * 
                 * 
                 */

                for(int i=0; i < clothing_items.length; i++){

                        for(int j =0; j < num_sizes; j++){
                                clothing_options.add(clothing_items[i] + " Size "  + (j+1));
                        }
                }

                return clothing_options;
                


        }


        public static double average_celsius(int[] fahrenheit_readings){

                double[] celsius_readings = new double[fahrenheit_readings.length];

                int index =0;

                /**
                 * BigO Notation:
                 * In this example we have two loops:
                 * The first loop iterates through (N) elements in our fahrenheit array it then converts each element into celsius and stores it in our celsius_readings array
                 * 
                 * The celsius array will always be as big as our fahrenheit array (N)
                 * 
                 * In the secound loop we are iterating over the celsius array and adding each element 
                 * 
                 * ALTHOUGH we have two loops the secound loop is located OUTSIDE of the first one 
                 * 
                 * This means we have N+N = 2N = O(2N) = O(N)
                 * 
                 * 
                 */
                for(int num: fahrenheit_readings){
                        celsius_readings[index] = (num-32)/ 1.8;
                        index++;
                }


                double sum =0;
                for(double num : celsius_readings){
                        sum+=num;
                }


                return sum/celsius_readings.length;
        }

        public static List<String> wordBuilder(String characters[]){
                
                List<String> list = new ArrayList<>();


                /**
                 * BigO Notation:
                 * We determined that N data elements is the string of characters that we passed into the function
                 * The first loop iterates through the array N times (N) being the size of the array
                 * The inner loop iterates again through N elements 
                 * 
                 * Worse Case:
                 * O(n^2)
                 */
                for(int i=0; i < characters.length;i++){
                        for(int j = 0; j < characters.length;j++){
                                if(j!=i){
                                        list.add(characters[i] + characters[j]);
                                }
                        }
                }

                return list;
        }
        

        public double average_of_evan_num(int nums[]){

                int sum =0;
                int count_of_evan_nums = 0;

                /**
                 * BigO notation:
                 * we loop through n elements with n being the size of the array
                 * if the number is evan then we perform 2 additional steps for a total of 3 steps 3N
                 * outside the loop we have initiaze two variables and perform an opertation 
                 * 
                 * WORSE CASE: O(3N+3)-->> since BigO notation ignores constants
                 * WORSE CASE: O(N)
                 */
                for(int num: nums){
                        if(num %2 ==0){
                                sum = sum+num;
                                count_of_evan_nums++;
                        }
                }

                return sum/count_of_evan_nums;
        }

        public void HTMLPrintOut(final String urlAddress){
                try {
                        URL url = new URL("https://v2.jokeapi.dev/joke/Any");

                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("GET");

                    
                        int code = conn.getResponseCode();
                        System.out.println("Respones code = " + code);

                        StringBuilder informationString = new StringBuilder();
                        Scanner scanner = new Scanner(url.openStream());

                        while(scanner.hasNext()){
                                informationString.append(scanner.nextLine());
                        }
                        
                        scanner.close();


                        JSONParser json = new JSONParser();
                
                        JSONObject dataObject = (JSONObject) json.parse(String.valueOf(informationString));


                        System.out.println(dataObject);
                        System.out.println();
                        System.out.println();

                        System.out.println(dataObject.get("setup"));
                        System.out.println(dataObject.get("delivery"));


                        
                } catch (MalformedURLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

        }

        public void stringTesting() {
                String stringOne = new String("hello World");
                String stringTwo = new String("Hello world");

                String containsString = "hello";
                String endWith = "llo";
                int offset = 2;
                int count = 3;

                // Takes the ascii value of 'h' = 104 and subtracts 'H' = 72
                System.out.println("compareTo: " + "StringOne: (" + stringOne + ") String Two: (" + stringTwo
                                + ") Result: " + stringOne.compareTo(stringTwo)); // prints 32

                // iqnores capitals or lowercase differances
                System.out.println("compareToIqnoreCase: " + "StringOne: (" + stringOne + ") String Two: (" + stringTwo
                                + ") Result: " + stringOne.compareToIgnoreCase(stringTwo));

                // concatenates the secound string to the end of the first one
                System.out.println("concat: " + "StringOne: (" + stringOne + ") String Two: (" + stringTwo
                                + ") Result: " + stringOne.concat(stringTwo));// "hH"

                // checks if the string contains a specific Char Sequance(String)
                System.out.println("contains: Word: (" + containsString + ") StringOne: (" + stringOne + ") Result: "
                                + stringOne.contains(containsString));// true

                // checks if the string contains the exact phrase
                System.out.println("containsEquals: Word: (" + containsString + ") stringOne: (" + stringOne
                                + ") Result: " + stringOne.contentEquals(containsString));// false

                // copies the values of the char array and returns a String
                char[] data = { 'P', 'e', 'l', 'l', 'o' };

                String str = "";
                for (char c : data) {

                        System.out.print("[" + c + "]");
                        str = str.concat("[" + c + "]");
                }
                System.out.println();

                stringOne = String.copyValueOf(data);
                System.out.println("copValueOf: Char Array: (" + str + ") Result: " + stringOne);

                // variation data,offset,count-> stars counting from the offset
                stringOne = String.copyValueOf(data, offset, count);// prints llo
                System.out.println("copValueOf: Char Array: (" + str + " Variation " + "offset: (" + offset
                                + ") count: (" + count + ") Result: " + stringOne);

                System.out.println("endWith: Word: (" + endWith + ") Result: " + stringOne.endsWith(endWith));

        }
}
