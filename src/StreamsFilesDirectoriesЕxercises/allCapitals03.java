package StreamsFilesDirectoriesЕxercises;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class allCapitals03 {
    public static void main(String[] args) throws FileNotFoundException {

        Path path= Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        FileReader fileReader=new FileReader(String.valueOf(path));


        try (BufferedReader reader=new BufferedReader(fileReader);){
            FileWriter output=new FileWriter("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");


            String text=reader.readLine();
           //while (t>=0) {
           //    for (int i = 0; i < text.length(); i++) {
           //        char symb = text.charAt(i);
           //        if (Character.isLetter(symb)) {
           //            symb = Character.toUpperCase(symb);
           //        }
           //        output.write(symb);
           //    }
           //    output.write("\r\n");
           //    count=reader.read();
           //}
            output.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
