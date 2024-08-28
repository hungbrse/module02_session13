package module02_session13.ex9;

class BinarySearchTree {
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Hàm tìm kiếm phần tử trong cây
    public boolean search(int element) {
        Node current = root; // Bắt đầu từ node gốc (root)

        while (current != null) {
            if (element < current.element) {
                current = current.left; // Đi về cây con bên trái nếu nhỏ hơn
            } else if (element > current.element) {
                current = current.right; // Đi về cây con bên phải nếu lớn hơn
            } else {
                return true; // Phần tử tìm thấy
            }
        }

        return false; // Phần tử không tồn tại trong cây
    }

    // Hàm thêm phần tử vào cây
    public void insert(int element) {
        root = insertRec(root, element);
    }

    // Hàm đệ quy để thêm phần tử mới
    private Node insertRec(Node root, int element) {
        if (root == null) {
            root = new Node(element);
            return root;
        }

        if (element < root.element) {
            root.left = insertRec(root.left, element);
        } else if (element > root.element) {
            root.right = insertRec(root.right, element);
        }

        return root;
    }

    // In-order traversal để in các phần tử của cây
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.element + " ");
            inorderRec(root.right);
        }
    }
}
