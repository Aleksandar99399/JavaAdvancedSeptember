package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class SoftuniParty02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Set<String> vipGuest = new TreeSet<>();
        Set<String> regularGuest = new TreeSet<>();
        Set<String> lack = new LinkedHashSet<>();

        String guess=scanner.nextLine();

        while (!"PARTY".equals(guess)){

            if (Character.isDigit(guess.charAt(0))){

                vipGuest.add(guess);
            }else {

                regularGuest.add(guess);
            }
            guess=scanner.nextLine();
        }

        String comeGuess=scanner.nextLine();

        while (!"END".equals(comeGuess)){
            if (vipGuest.contains(comeGuess)){
                vipGuest.remove(comeGuess);
            }else if (regularGuest.contains(comeGuess)){
                regularGuest.remove(comeGuess);
            }
            comeGuess=scanner.nextLine();
        }
        System.out.println(vipGuest.size()+regularGuest.size());
        for (String s : vipGuest) {
            System.out.println(s);
        }
        for (String s : regularGuest) {
            System.out.println(s);
        }


    }
}
