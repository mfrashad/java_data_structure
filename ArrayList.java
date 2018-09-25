package data_structure;

import java.utils.Arrays;

public class ArrayList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPAITY];
    }

    public void add(E e){
        if(size==elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i){
        if (i > size){
            throw new IndexOutOfBoundsException("Index: " + i +", Size " + i);
        }
        return (E) elements[i];
    }
}
