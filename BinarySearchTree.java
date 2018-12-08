public class BinarySearchTree<T extends Comparable> implements BinarySearchTreeInterface<T> {
    
    class Node {
        T key;
        Node left, right;

        public Node(T item){
            key = item;
        }
    }

    private Node root;

    public BinarySearchTree(){
        root = null;
    }
    
    public BinarySearchTree(T item){
        insert(item);
    }
    
    public void insert(T item){
        root = insertRec(root, item);
    }
    
    private Node insertRec(Node root, T item){
        if(root == null){
            root = new Node(item);
            return root;
        }

        if(item.compareTo(root.key) < 0) root.left = insertRec(root.left, item);
        else if (item.compareTo(root.key) > 0) root.right = insertRec(root.right, item);
        return root;
    }
    
    public T remove(T item){
        root = removeRec(root, item);
        return item;
    }   

    private Node removeRec(Node root, T item){
        if(root == null) return root;
        if(item.compareTo(root.key) < 0){
            root.left = removeRec(root.left, item);
        } else if (item.compareTo(root.key) > 0){
            root.right = removeRec(root.right, item);
        } else {
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else {
                root.key = minValue(root.right);
                root.right = removeRec(root.right, root.key);
            }
        }
        return root;
    }

    public T minValue(Node root){
        T minv = root.key;
        while(root.left != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public void inorder(){
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root){
        if(root == null) return;
        inorderRec(root.left);
        System.out.print(root.key + " ");
        inorderRec(root.right);
    }

    public void preorder(){
        preorderRec(root);
        System.out.println();
    }
    public void postorder(){
        postorderRec(root);
        System.out.println();
    }
    private void preorderRec(Node root){
        if(root == null) return;
        System.out.print(root.key + " ");
        preorderRec(root.left);
        preorderRec(root.right);
    }
    private void postorderRec(Node root){
        if(root == null) return;
        postorderRec(root.left);
        postorderRec(root.right);
        System.out.print(root.key + " ");
    }
}
