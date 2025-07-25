import java.util.*;

public class HeightofTree{
    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int he = Math.max(lh, rh)+1;
        return he;
    }
    public static void main(String args []){

        Node root = new Node(1);                          
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        HeightofTree cl = new HeightofTree();
        System.out.print("Height of Tree is:"+cl.height(root));
    }
}