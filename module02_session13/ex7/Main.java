package module02_session13.ex7;

public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);

        System.out.println("Xóa phần tử 10: " + tree.delete(10));
        System.out.println("Xóa phần tử 20: " + tree.delete(5));
    }
}
