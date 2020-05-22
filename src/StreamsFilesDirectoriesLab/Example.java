package StreamsFilesDirectoriesLab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example {
    public static void main(String[] args) throws IOException {
        Path inPath= Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath= Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");

        List<String>lines=Files.readAllLines(inPath);

        Files.write(outPath,lines);

        for (String line : lines) {
            System.out.println(line);
        }


    }
}
