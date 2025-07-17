public class Searching {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node tree(int val, Node root) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = tree(val, root.left);
    } else {
      root.right = tree(val, root.right);
    }
    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data);
    inorder(root.right);
  }

  public static boolean search(Node root, int key) {
    if (root == null) {
      return false;
    }
    if (root.data == key) {
      return true;
    }
    if (root.data > key) {
      return search(root.left, key);
    } else {
      return search(root.right, key);
    }
  }

  public static void main(String args[]) {
    int values[] = { 5, 1, 3, 4, 2, 7 };
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = tree(values[i], root);
    }
    // inorder(root);

    if (search(root, 3)) {
      System.out.print("The Key are present:");
    } else {
      System.out.print("Key are Not present:");
    }
  }
}
