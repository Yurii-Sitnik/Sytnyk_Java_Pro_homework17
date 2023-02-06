public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(4);
        tree.addNode(6);
        tree.addNode(7);
        tree.addNode(10);
        tree.addNode(13);
        tree.addNode(14);

        System.out.print("Прямой обход дерева: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nЦентрированный обход дерева: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nОбратный обход дерева: ");
        tree.traversePostOrder(tree.root);
    }
}

