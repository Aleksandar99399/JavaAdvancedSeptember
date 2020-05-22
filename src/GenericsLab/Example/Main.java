package GenericsLab.Example;



public class Main {
    public static void main(String[] args){

        Jar<Integer> jar=new Jar<>();

        jar.add(5);
        jar.add(7);
        jar.add(9);

        Jar<String> sad=new Jar<>();
        sad.add("x");
        sad.add("sadafsdds");
        System.out.println(jar.remove());
        System.out.println(sad.remove());
    }
}
