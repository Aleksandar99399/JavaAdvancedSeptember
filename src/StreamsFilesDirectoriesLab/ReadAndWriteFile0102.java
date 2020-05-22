package StreamsFilesDirectoriesLab;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class ReadAndWriteFile0102 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        String basePath="C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\";
        String inputPath=basePath+ "input.txt";
        String outputPath=basePath+ "output.txt";

        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream=new FileOutputStream(outputPath);

        Set<Character>punctuation=new HashSet<>();
        Collections.addAll(punctuation,',', '.', '!', '?');
        int readByte=inputStream.read();
        while (readByte>=0){
            if (!punctuation.contains((char) readByte)) {
                System.out.print((char) readByte);
            }
            readByte=inputStream.read();
        }
    }
}
