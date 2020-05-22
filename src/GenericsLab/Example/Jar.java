package GenericsLab.Example;

import java.util.ArrayDeque;

/**
 *
 * @param <T>
 */
public class Jar<T> {

    private ArrayDeque<T>data; //=new ArrayDeque<>();

    public Jar() {
        this.data = new ArrayDeque<>();
    }

    public void add(T element){
        data.push(element);
    }

    public T remove(){
        return this.data.pop();
    }
}
