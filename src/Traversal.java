public class Traversal {
  public static void main(String[] args) {
      // Creating the tree
      TreeNode root = new TreeNode(77, null, null);
      root.left = new TreeNode(22, null, null);
      root.right = new TreeNode(33, null, null);
      root.right.left = new TreeNode(66, null, null);
      root.left.right = new TreeNode(5, null, null);
      root.left.right.left = new TreeNode(0, null, null);

      // Printing the value of root.left.right
      // preOrder(root);
      // System.err.println();
      // inOrder(root);
      // System.out.println();
      // postOrder(root);
      greaterThan(root, 30);
  }

  public static void preOrder(TreeNode node){
    if(node == null){
      return;
    }
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }

  public static void postOrder(TreeNode node){
    if(node == null){
      return;
    }
    
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value);
  }

  public static void inOrder(TreeNode node){
    if(node == null){
      return;
    }
    
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
    
  }


  public static void greaterThan(TreeNode node, int num){
    /*
     * 
     * Capturing nodes larger than 50
     * 
     * if null return 
     * 
     * if node.value > 50
     *  print node.value
     * greaterThan50(node.left)
     * greaterThan50(node.right)
     */

     if(node == null) return;
     if(node.value > num){
      System.out.println(node.value);
     }
     greaterThan(node.left, num);
     greaterThan(node.right, num);
  }
}
