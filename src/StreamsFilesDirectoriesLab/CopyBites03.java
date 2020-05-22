package StreamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class CopyBites03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(in);

        String path="C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\";
        String input=path+"input.txt";

        FileInputStream inputStream=new FileInputStream(input);
        FileOutputStream outputStream=new FileOutputStream(path+"output.txt");

        int byteStream=inputStream.read();
        while (byteStream>=0){

                if (!(byteStream==10|| byteStream==32)){
                    System.out.print(byteStream);
                    outputStream.write(byteStream);
                }else if (byteStream==32){
                    System.out.print(" ");
                    outputStream.write(byteStream);
                }else {
                    System.out.println();
                }

            byteStream=inputStream.read();
        }

    }
}
