public class BinaryTree {
    protected Node root;

    public void addNode(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);

        }
        if (value < current.getKey()) {
            current.setLeft(addNode(current.getLeft(), value));
        } else if (value > current.getKey()) {
            current.setRight(addNode(current.getRight(), value));
        }
        return current;
    }

    // In-order Traversal
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    // Post-order Traversal
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    // Pre-order Traversal
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}

