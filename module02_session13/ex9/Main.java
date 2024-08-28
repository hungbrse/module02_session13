package module02_session13.ex9;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();


        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal:");
        tree.inorder();
        System.out.println();

        System.out.println("Tìm kiếm 40 trong cây: " + tree.search(40));
        System.out.println("Tìm kiếm 90 trong cây: " + tree.search(90));
    }
}
