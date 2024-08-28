package module02_session13.ex7;

public class BST<E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size = 0;

    public BST() {
    }

    // Thêm phần tử vào BST
    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false; // Phần tử đã tồn tại trong cây
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
        return true;
    }

    // Xóa phần tử khỏi BST
    public boolean delete(E e) {
        // Xác định vị trí của phần tử cần xóa
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // Phần tử cần xóa được tìm thấy
            }
        }

        if (current == null) {
            return false; // Phần tử không tồn tại trong cây
        }

        // Trường hợp 1: current không có nút con trái
        if (current.left == null) {
            // Kết nối cha với nút con phải của current
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            // Trường hợp 2: current có nút con trái
            // Tìm rightMost và parentOfRightMost
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            // Thay thế giá trị của current bằng giá trị của rightMost
            current.element = rightMost.element;

            // Kết nối parentOfRightMost với nút con trái của rightMost
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                parentOfRightMost.left = rightMost.left;
            }
        }

        size--;
        return true; // Phần tử đã bị xóa
    }

    // Các phương thức khác như duyệt cây, tìm kiếm, vv.
}