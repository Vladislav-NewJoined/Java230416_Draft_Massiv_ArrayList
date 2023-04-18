
public class MyArrayList<T> {
//    из видео https://youtu.be/UjkqeSDSUgc
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            list = (T[]) new Object[capacity];

        }

    }
    public MyArrayList(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }
}
