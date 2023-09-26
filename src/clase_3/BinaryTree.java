package clase_3;

import java.util.Random;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}


public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Random random = new Random();

        System.out.println("Inserting random values into the tree:");
        for (int i = 0; i < 7; i++) {
            int randomValue = random.nextInt(100);
            System.out.print(randomValue + " ");
            tree.insert(randomValue);
        }

        System.out.println("\nIn-order traversal:");
        tree.inOrderTraversal();

        System.out.println("\nPre-order traversal:");
        tree.preOrderTraversal();

        System.out.println("\nPost-order traversal:");
        tree.postOrderTraversal();
    }
}

