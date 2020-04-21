package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUtil {

    public static void insert(int data, BinaryTree bin){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(bin.root);

        while(!q.isEmpty()){
            bin.root = q.peek();
            q.remove();

            if (bin.root.left == null){
                bin.root.left = new TreeNode(data);
                break;
            }
            else {
                q.add(bin.root.left);
            }

            if (bin.root.right == null){
                bin.root.right = new TreeNode(data);
                break;
            }
            else {
                q.add(bin.root.right);
            }
        }
    }
    public static void main (String[] args){

    }
}
