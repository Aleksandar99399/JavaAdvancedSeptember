package StreamsFilesDirectoriesЕxercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumLines01 {
    public static void main(String[] args) throws IOException {

        Path path= Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        FileReader fileReader=new FileReader(String.valueOf(path));


        try (BufferedReader reader=new BufferedReader(fileReader);){
            String text=reader.readLine();

            while (text!=null) {
                int sum=0;
                for (int i = 0; i < text.length(); i++) {
                    sum += text.charAt(i);
                }
                System.out.println(sum);
                text=reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
