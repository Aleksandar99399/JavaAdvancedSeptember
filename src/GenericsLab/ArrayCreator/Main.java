package GenericsLab.ArrayCreator;

public class Main {
    public static void main(String[] args) {

        //Integer [] numbers=(Integer[]) ArrayCreator.create(4,2);

        //for (int i = 0; i < numbers.length; i++) {
        //    System.out.println(numbers[i]);
//
        //}

        String[] strings=ArrayCreator.create(String.class,5,"asd");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);

        }
    }
}
