package StreamsFilesDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine05 {
    public static void main(String[] args) {

        String path="C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\";
        String inputPath=path+"input.txt";
        String outputPath=path+"third.txt";


        try (FileReader inputReader=new FileReader(inputPath);
             FileOutputStream outputStream=new FileOutputStream(outputPath)){

            BufferedReader reader=new BufferedReader(inputReader);
            PrintWriter writer=new PrintWriter(outputStream,true);

            int counter=1;
            String line=reader.readLine();
            while (line!=null){
                if (counter%3==0){

                    writer.println(line);
                }
                counter++;
                line=reader.readLine();

            }
        } catch (IOException e) {
            System.out.println("Really bad!");
        }
    }
}
