package Scale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> scale=new Scale<>(5,7);
        Scale<String> stringScale=new Scale<>("left", "right");


        System.out.println(scale.getHeavier());
        System.out.println(stringScale.getHeavier());
    }
}
