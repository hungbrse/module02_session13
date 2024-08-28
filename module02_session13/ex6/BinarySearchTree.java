package module02_session13.ex6;

public class BinarySearchTree {
    Node root;

    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left);

        postOrderTraversal(node.right);

        System.out.print(node.data + " ");
    }

    void postOrder() {
        postOrderTraversal(root);
    }
}