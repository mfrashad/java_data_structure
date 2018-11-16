public interface StackInterface<T> {
    public void push(T newEntry);
    public T pop();
    public T peek();
    public void clear();
    public boolean isEmpty();
    public void print();
}
