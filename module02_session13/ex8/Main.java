package module02_session13.ex8;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(18);

        System.out.println("Duyệt theo thứ tự preorder:");
        tree.preorderTraversal(tree.root);
    }
}
