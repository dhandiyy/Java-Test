import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringInFile {
    public static void findStringInFile() throws FileNotFoundException {
        String fileName = "text.txt";
        String targetString = "test";

        Scanner scanner = new Scanner(new File(fileName));
        boolean found = false;
        int countLine = 1;

        while(scanner.hasNextLine()){
            String stringPerLine = scanner.nextLine();
            if(stringPerLine.contains(targetString)){
                System.out.println("String funded  in line " + countLine);
                System.out.println("In this sentence: " + stringPerLine);
                found = true;

            }
            countLine++;
        }
        if(!found){
            System.out.println("String not found in file");
        }
        scanner.close();


    }
}
