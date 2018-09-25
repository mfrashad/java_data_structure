package java_data_structure;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        if(size==elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void print(){
        for(int i=0; i<size; i++){
            System.out.println(elements[i]);
        }
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

    public boolean contains(E item){
        for(int i=0; i<size; i++){
            if(elements[i] == item){
                return true;
            }
        }
        return false;
    }

    public E getItem(E item){
        for(int i=0; i<size;i++){
            if(elements[i] == item){
                return (E)elements[i];
            }
        }
        return null;
    }

    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.print();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");
        list2.print();
        System.out.println(list2.contains("Hello"));
        System.out.println(list2.getItem("Hello"));


    }
}
