package module02_session13.ex8;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Phương thức duyệt preorder
    void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Bước 1: Truy cập nút gốc
        System.out.print(node.value + " ");

        // Bước 2: Duyệt cây con bên trái đệ quy
        preorderTraversal(node.left);

        // Bước 3: Duyệt cây con bên phải đệ quy
        preorderTraversal(node.right);
    }
}
