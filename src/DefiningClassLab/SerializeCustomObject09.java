package DefiningClassLab;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializeCustomObject09 {

    public static void main(String[] args) throws IOException {
        Cube cube=new Cube("red",1.2,3.4,5.5);
        Path inPath = Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath = Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");
        String outputPath=outPath+"cube.txt";

        try (FileOutputStream outputStream=new FileOutputStream(outputPath);
            ObjectOutputStream writer=new ObjectOutputStream(outputStream);){
            writer.writeObject(cube);
        }
    }
}

class Cube implements Serializable{
    String color;
    double width;
    double height;
    double depth;

    public Cube(String color, double width, double height, double depth) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
