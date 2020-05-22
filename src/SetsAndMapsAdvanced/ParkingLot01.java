package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.in;

public class ParkingLot01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);

        HashSet<String>parkedCars=new HashSet<>();

        String[]input=scanner.nextLine().split(", ");

        while (!input[0].equals("END")){
            String registracion=input[1];
            if ("IN".equals(input[0])){
                parkedCars.add(registracion);

            }else {

                parkedCars.remove(registracion);
            }
            input=scanner.nextLine().split(", ");
        }

        if (parkedCars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String parkedCar : parkedCars) {
                System.out.println(parkedCar);
            }
        }

    }
}
