public class main
{
  public static void main(String[] args)
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>();
    tree.setRoot(new BinaryTreeNode<Integer>(1));
    tree.getRoot().addLeftChild(new BinaryTreeNode<Integer>(5));
    tree.getRoot().addRightChild(new BinaryTreeNode<Integer>(3));
    tree.getRoot().getLeftChild().addLeftChild(new BinaryTreeNode<Integer>(2));
    tree.getRoot().getLeftChild().addRightChild(new BinaryTreeNode<Integer>(4));
    tree.getRoot().getLeftChild().getRightChild().addLeftChild(new BinaryTreeNode<Integer>(9));
    tree.getRoot().getRightChild().addLeftChild(new BinaryTreeNode<Integer>(6));
    tree.getRoot().getRightChild().addRightChild(new BinaryTreeNode<Integer>(8));



    BinaryTreePrint print = new BinaryTreePrint();


    print.printTree(tree.getRoot());
    System.out.println("\n"+tree.inOrder());
    System.out.println("\n"+tree.preOrder());
    System.out.println("\n"+tree.postOrder());
    System.out.println("\n"+tree.levelOrder());
    System.out.println("\n"+tree.height());


    BinarySearchTree<Integer> tree2 = new BinarySearchTree<Integer>();
    tree2.insert(5);
    tree2.insert(3);
    tree2.insert(7);
    tree2.insert(2);
    tree2.insert(4);
    tree2.insert(9);
    tree2.insert(6);
    tree2.insert(8);

    print.printTree(tree2.getRoot());

    tree2.removeElement(7);

    print.printTree(tree2.getRoot());
  }
}
