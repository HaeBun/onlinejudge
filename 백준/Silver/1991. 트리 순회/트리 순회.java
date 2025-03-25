import java.util.Scanner;

class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;
}

class BinaryTree {
    TreeNode root;

    public void createNode(char value, char left, char right) {
        if(root == null) {
            root = new TreeNode();
            root.data = value;

            if(left != '.') {
                TreeNode leftNode = new TreeNode();
                leftNode.data = left;
                root.left = leftNode;
            }
            if(right != '.') {
                TreeNode rightNode = new TreeNode();
                rightNode.data = right;
                root.right = rightNode;
            }
        } else {
            searchNode(root, value, left, right);
        }
    }

    public void searchNode(TreeNode root, char data, char left, char right) {
        if(root == null) {
            return;
        } else if(root.data == data) {
            if (left != '.') {
                TreeNode leftNode = new TreeNode();
                leftNode.data = left;
                root.left = leftNode;
            }
            if (right != '.') {
                TreeNode rightNode = new TreeNode();
                rightNode.data = right;
                root.right = rightNode;
            }
        } else {
            searchNode(root.left, data, left, right);
            searchNode(root.right, data, left, right);
        }
    }

    // 전위 순회
    public void preorder(TreeNode root) {
        if(root != null){
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    // 중위 순회
    public void inorder(TreeNode root) {
        if(root != null){
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }

    // 후위 순회
    public void postorder(TreeNode root) {
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.valueOf(stdIn.nextLine());
        BinaryTree tree = new BinaryTree();

        for(int i = 0; i < n; i++) {
            String line = stdIn.nextLine();
            tree.createNode(line.split(" ")[0].charAt(0), line.split(" ")[1].charAt(0), line.split(" ")[2].charAt(0));
        }

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
    }
}