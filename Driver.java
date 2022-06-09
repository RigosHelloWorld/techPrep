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
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Driver {

        public static void main(String[] args) {
     
                

        }// end of main function




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
