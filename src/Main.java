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

        System.out.print("������ ����� ������: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\n�������������� ����� ������: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\n�������� ����� ������: ");
        tree.traversePostOrder(tree.root);
    }
}

