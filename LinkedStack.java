public class LinkedStack<T> implements StackInterface<T> {
    private Node topNode;

    public LinkedStack(){
        topNode = null;
    }
    
    public void push(T newEntry){
        Node newNode = new Node(newEntry, topNode);
        this.topNode = newNode; 
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return topNode.getData();
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        T top = topNode.getData();
        topNode = topNode.getNext();
        return top;
    }

    public void clear(){
        topNode = null;
    }

    public boolean isEmpty(){
        return topNode == null;
    }

    public String toString(){
        String result = "[";
        Node currentNode = topNode;
        while(currentNode != null){
            result += " " + currentNode.getData().toString();
            currentNode = currentNode.getNext();
        }
        result += " ]";
        return result;
    }

    public void print(){
        System.out.println(toString());
    }
    


    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
        
        public Node getNext(){
            return next;
        }
        public void setNext(Node newNode){
            this.next = newNode;
        }
        public T getData(){
            return this.data;
        }
        public void setData(T newData){
            this.data = newData;
        }
    }
}
