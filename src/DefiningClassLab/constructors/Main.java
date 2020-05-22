package DefiningClassLab.constructors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int count=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            Car car;
            if (carInfo.length==1){
                car=new Car(carInfo[0]);
            }else {
                car=new Car(carInfo[0],carInfo[1],Integer.parseInt(carInfo[2]));
            }

            System.out.println(car.toString());
        }
    }
}
