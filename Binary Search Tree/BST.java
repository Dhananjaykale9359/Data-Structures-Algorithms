public class BST {

  static class Node {

    Node left;
    Node right;
    int data;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node buildbst(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (root.data > data) {
      root.left = buildbst(root.left, data);
    } else {
      root.right = buildbst(root.right, data);
    }
    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String args[]) {
    int values[] = { 5, 1, 3, 4, 2};
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = buildbst(root, values[i]);
    }
    inorder(root);
  }
}
