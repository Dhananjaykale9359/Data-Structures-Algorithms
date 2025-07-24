public class Mirror {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    // @Override
    public String toString() {
      return Integer.toString(data);
    }
  }

  public static Node mirror(Node root) {
    if (root == null) {
      return null;
    }
    Node lefts = mirror(root.left);
    Node rights = mirror(root.right);

    root.left = rights;
    root.right = lefts;

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
    Node root = new Node(8);
    root.left = new Node(5);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right = new Node(10);
    root.right.right = new Node(11);

    System.out.println("Inorder Traversal of Tree Before Changing:");
    inorder(root);

    System.out.println(mirror(root));

    System.out.println("Inorder Traversal after changing the Tree:");
    inorder(root);
  }
}
