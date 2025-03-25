import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode (int value) {
        data = value;
    }
}

class BinaryTree {
    TreeNode root;
    public void insertNode(TreeNode node,int value) {
        if(node == null) {
            root = new TreeNode(value);
            return;
        }

        if(node.data < value) { // right
            if(node.right == null) {
                node.right = new TreeNode(value);
            }
            else {
                insertNode(node.right, value);
            }
        }
        else {
            if(node.left == null) {
                node.left = new TreeNode(value);
            }
            else {
                insertNode(node.left, value);
            }
        }

    }
    // 후위 순회
    public void postorder(TreeNode root) {
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BinaryTree tree = new BinaryTree();
        tree.insertNode(tree.root,Integer.parseInt(br.readLine()));
        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals(""))
                break;
            tree.insertNode(tree.root,Integer.parseInt(input));
        }

        tree.postorder(tree.root);
    }
}