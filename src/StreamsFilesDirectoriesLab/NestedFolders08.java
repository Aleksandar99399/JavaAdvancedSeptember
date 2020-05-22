package StreamsFilesDirectoriesLab;

import java.io.File;
import java.util.*;

public class NestedFolders08 {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources");

        File[] files=file.listFiles();
        ArrayDeque<File> toTraverse = new ArrayDeque<>(Arrays.asList(files));
        int folderCount=0;
        while (toTraverse.size()>0){
            File current=toTraverse.poll();

            if (current.isDirectory()){
                System.out.println(current.getName());
                List<File> filesList = Arrays.asList(current.listFiles());
                toTraverse.addAll(filesList);
                folderCount++;
            }
        }
        System.out.println(folderCount+" folders");
    }
}
