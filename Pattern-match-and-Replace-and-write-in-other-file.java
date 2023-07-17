import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        File object = new File("Test.txt");
        try{
            Scanner reader = new Scanner(object);
            FileWriter writer = new FileWriter("output.txt");
            
            String line = reader.nextLine();
            String[] splitLines = line.split(";");

            for (String splitLine : splitLines) {

                if(Pattern.matches("(.*)India(.*)",splitLine)){
                    splitLine = splitLine.replace("India","USA");
                }else if(Pattern.matches("(.*)USA(.*)",splitLine)){
                    splitLine = splitLine.replace("USA","UAE");
                }else{
                    splitLine = splitLine.replace("UAE","India");
                }


                writer.write(splitLine.trim());
                writer.append("\n");

            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Exception Occured !!!!!!!!!!!");
            e.printStackTrace();
        }
    }
}
