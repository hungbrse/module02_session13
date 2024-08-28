package module02_session13.ex6;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.root = new Node(4);
        bst.root.left = new Node(2);
        bst.root.right = new Node(6);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(3);
        bst.root.right.left = new Node(5);

        System.out.println("Duyệt theo thứ tự post-order:");
        bst.postOrder();
    }
}
