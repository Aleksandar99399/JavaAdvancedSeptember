package StreamsFilesDirectoriesЕxercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumBytes02 {
    public static void main(String[] args) throws FileNotFoundException {

        Path path= Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt");
        FileReader fileReader=new FileReader(String.valueOf(path));

        try (BufferedReader reader=new BufferedReader(fileReader)){
            int count=reader.read();
            int sum=0;
            while (count>=0){
                sum+=count;
                count=reader.read();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
