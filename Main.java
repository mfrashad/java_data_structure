public class Main {
    public static void main(String args[]){
        StackInterface<Integer> intStack = new LinkedStack<>();
        intStack.push(3);
        intStack.push(5);
        intStack.push(4);
        intStack.print();
        System.out.print("Popped ");
        System.out.println(intStack.pop());
        intStack.print();
    }
}
