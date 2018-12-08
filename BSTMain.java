public class BSTMain {
    public static void main(String[] args){
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(25);
        bst.insert(100);
        bst.insert(45);
        bst.insert(10);
        bst.insert(30);
        bst.insert(48);
        bst.insert(15);
        bst.insert(5);
        bst.insert(80);
        bst.insert(120);
        bst.insert(70);
        bst.insert(85);
        bst.insert(110);
        bst.insert(130);
        System.out.println("In Order: ");
        bst.inorder();
        System.out.println();
        System.out.println("Pre Order: ");
        bst.preorder();
        System.out.println();
        System.out.println("Post Order: ");
        bst.postorder();


        System.out.println();
        System.out.println("Removing 100");
        bst.remove(100);

        System.out.println("In Order: ");
        bst.inorder();
        System.out.println();
        System.out.println("Pre Order: ");
        bst.preorder();
        System.out.println();
        System.out.println("Post Order: ");
        bst.postorder();


        
    }
}
