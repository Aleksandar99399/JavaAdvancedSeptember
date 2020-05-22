package StreamsFilesDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class ExtractInteger04 {
    public static void main(String[] args) throws FileNotFoundException {
        String path="C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\";
        String inputPath=path+"input.txt";
        String outputPath=path+"integers.txt";


        try (FileInputStream inputStream=new FileInputStream(inputPath);
            FileOutputStream outputStream=new FileOutputStream(outputPath)){

            Scanner scanner=new Scanner(inputStream);
            PrintStream writer=new PrintStream(outputStream);

            while (scanner.hasNext()){
                if (scanner.hasNextInt()){
                    int number=scanner.nextInt();
                    writer.println(number);
                }
                scanner.next();
            }
        } catch (IOException e) {
            System.out.println("Really bad!");
        }
    }
}
