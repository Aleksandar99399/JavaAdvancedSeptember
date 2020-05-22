package StreamsFilesDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines06 {
    public static void main(String[] args) throws IOException {

        Path inPath = Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath = Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");


        try {
            List<String> lines = Files.readAllLines(inPath);
            Collections.sort(lines);

            Files.write(outPath, lines);

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
        // Files.write(outPath,lines);
        // for (String line : lines) {
        //     System.out.println(line);
        // }

    }
}
