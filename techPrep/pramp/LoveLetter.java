import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LoveLetter {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("loveletter.txt"));
            System.out.println(scanner.nextLine());

        } catch (FileNotFoundException e) {
            System.out.println("File not");
        }

      
    }

}