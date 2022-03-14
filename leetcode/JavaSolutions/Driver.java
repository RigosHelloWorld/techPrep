
public class Driver {

    
    public static void main(String[] args) {

   

        

    }

    public void stringTesting(){
        String stringOne = new String("hello World");
        String stringTwo = new String("Hello world");

        String containsString = "hello";
        String endWith = "llo";
        int offset = 2;
        int count = 3;



        //Takes the ascii value of 'h' = 104 and subtracts 'H' = 72
        System.out.println("compareTo: " + "StringOne: (" + stringOne +
        ") String Two: (" + stringTwo + ") Result: " +
            stringOne.compareTo(stringTwo)); //prints 32

        //iqnores capitals or lowercase differances
        System.out.println("compareToIqnoreCase: " + "StringOne: (" + stringOne +
        ") String Two: (" + stringTwo + ") Result: " +
        stringOne.compareToIgnoreCase(stringTwo));  

        //concatenates the secound string to the end of the first one
        System.out.println("concat: " + "StringOne: (" + stringOne +
        ") String Two: (" + stringTwo + ") Result: " +
        stringOne.concat(stringTwo));//"hH"

        //checks if the string contains a specific Char Sequance(String)
        System.out.println("contains: Word: (" + containsString +  ") StringOne: (" + stringOne +") Result: " +
        stringOne.contains(containsString));//true

        //checks if the string contains the exact phrase
        System.out.println("containsEquals: Word: (" + containsString + ") stringOne: (" + stringOne + ") Result: " +
            stringOne.contentEquals(containsString));//false

        //copies the values of the char array and returns a String
        char[] data = {'P','e','l','l','o'};


        String str = "";
        for(char c : data){
            
            System.out.print("[" + c + "]");
            str = str.concat("[" + c + "]");
        }
        System.out.println();


        stringOne = String.copyValueOf(data);
        System.out.println("copValueOf: Char Array: (" + str + ") Result: " +  stringOne);

        //variation data,offset,count-> stars counting from the offset
        stringOne = String.copyValueOf(data,offset,count);// prints llo
        System.out.println("copValueOf: Char Array: (" + str + " Variation " + "offset: (" + offset +
        ") count: (" + count +
        ") Result: " +  stringOne);

        System.out.println("endWith: Word: (" + endWith + ") Result: " + stringOne.endsWith(endWith));

    }
}
