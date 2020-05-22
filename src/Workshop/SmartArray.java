package Workshop;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size] = element;
        this.size++;
    }

    public void add(int index,int element){
        this.size++;
        checkIndex(index);

        if (this.size>=this.capacity){
            this.resize();
        }
        this.shiftRight(index);
        this.data[index]=element;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.data[index];
    }

    public int remove(int index) {
        int element = this.get(index);

        this.shiftLeft(index);
        //this.shiftRight(index);
        this.size--;
        if (this.capacity / this.size >= 4) {
            this.shrink();
        }
        return element;
    }

    private void shrink() {
        this.capacity=this.size*2;
        int[]temp=new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            temp[i]=data[i];
        }
        this.data=temp;
    }

    private void shiftRight(int index) {
        for (int i = index; i <this.size ; i++) {
            int el=this.data[index+1];
            this.data[i]=el;

        }
        //for (int i = this.size-1; i >= index; i--) {
        //    this.data[i]=this.data[i-1];
        //}
    }

    private void shiftLeft(int index) {
        for (int i = index; i < this.size; i++) {
            this.data[i] = this.data[i + 1];
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            String errorMessage = "Index " + index + " is out of bounds";
            throw new IndexOutOfBoundsException(errorMessage);
        }
    }

    private void resize() {
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.capacity; i++) {
            temp[i] = data[i];

        }
        this.capacity *= 2;
        this.data = new int[this.capacity];
        System.arraycopy(temp, 0, this.data, 0, this.capacity / 2);
    }

}
