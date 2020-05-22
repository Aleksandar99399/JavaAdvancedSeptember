package DefiningClassLab;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Car car=new Car();
            String[]input=scanner.nextLine().split("\\s+");
            car.setMake(input[0]);
            car.setModel(input[1]);
            car.setHorsepower(Integer.parseInt(input[2]));
            System.out.println(car.carInfo());
        }
    }
}
