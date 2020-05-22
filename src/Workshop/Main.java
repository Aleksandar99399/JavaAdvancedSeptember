package Workshop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartArray sArray=new SmartArray();

        for (int i = 0; i < 5; i++) {
            sArray.add(i);
        }
        sArray.add(2,10);
        for (int i = 0; i < 5; i++) {
            System.out.println(sArray.get(i));
        }

    }
}
