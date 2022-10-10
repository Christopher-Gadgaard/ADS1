import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinaryTreeTest
{

  @Test void canCreateEmptyTree()
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>();
    assertNull(tree.getRoot());
  }

  @Test void canCreateTreeWithRoot()
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>(new BinaryTreeNode<Integer>(5));
    assertEquals(5, tree.getRoot().getElement());
  }

  @Test void canInsertAndRetrieveInteger()
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>();
    tree.setRoot(new BinaryTreeNode<Integer>(5));
    assertEquals(5, tree.getRoot().getElement());
  }

  @Test void canInsertAndRetrieveString()
  {
    BinaryTree<String> tree = new BinaryTree<String>();
    tree.setRoot(new BinaryTreeNode<String>("Hello"));
    assertEquals("Hello", tree.getRoot().getElement());
  }

  @Test void canAddLeftChildAsInteger()
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>();
    tree.setRoot(new BinaryTreeNode<Integer>(5));
    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>();
    leftChild.setElement(3);
    tree.getRoot().addLeftChild(leftChild);
    assertEquals(3, tree.getRoot().getLeftChild().getElement());
  }

  @Test void canAddRightChildAsInteger()
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>();
    tree.setRoot(new BinaryTreeNode<Integer>(5));
    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>();
    rightChild.setElement(7);
    tree.getRoot().addRightChild(rightChild);
    assertEquals(7, tree.getRoot().getRightChild().getElement());
  }

  @Test void canAddLeftChildAsString()
  {
    BinaryTree<String> tree = new BinaryTree<String>();
    tree.setRoot(new BinaryTreeNode<String>("Hello"));
    BinaryTreeNode<String> leftChild = new BinaryTreeNode<String>();
    leftChild.setElement("World");
    tree.getRoot().addLeftChild(leftChild);
    assertEquals("World", tree.getRoot().getLeftChild().getElement());
  }

  @Test void canAddRightChildAsString()
  {
    BinaryTree<String> tree = new BinaryTree<String>();
    tree.setRoot(new BinaryTreeNode<String>("Hello"));
    BinaryTreeNode<String> rightChild = new BinaryTreeNode<String>();
    rightChild.setElement("World");
    tree.getRoot().addRightChild(rightChild);
    assertEquals("World", tree.getRoot().getRightChild().getElement());
  }

  @Test void canAddToChildOfChildAsInteger()
  {
    BinaryTree<Integer> tree = new BinaryTree<Integer>();
    tree.setRoot(new BinaryTreeNode<Integer>(5));
    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>();
    leftChild.setElement(3);
    tree.getRoot().addLeftChild(leftChild);
    BinaryTreeNode<Integer> leftLeftChild = new BinaryTreeNode<Integer>();
    leftLeftChild.setElement(1);
    tree.getRoot().getLeftChild().addLeftChild(leftLeftChild);
    assertEquals(1, tree.getRoot().getLeftChild().getLeftChild().getElement());
  }

  @Test void canAddToChildOfChildAsString()
  {
    BinaryTree<String> tree = new BinaryTree<String>();
    tree.setRoot(new BinaryTreeNode<String>("Hello"));
    BinaryTreeNode<String> leftChild = new BinaryTreeNode<String>();
    leftChild.setElement("World");
    tree.getRoot().addLeftChild(leftChild);
    BinaryTreeNode<String> leftLeftChild = new BinaryTreeNode<String>();
    leftLeftChild.setElement("!");
    tree.getRoot().getLeftChild().addLeftChild(leftLeftChild);
    assertEquals("!", tree.getRoot().getLeftChild().getLeftChild().getElement());
  }

 @Test void canInOrder()
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
    assertEquals("[2, 5, 9, 4, 1, 6, 3, 8]", tree.inOrder().toString());
 }

  @Test void canPreOrder()
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
      assertEquals("[1, 5, 2, 4, 9, 3, 6, 8]", tree.preOrder().toString());
  }

  @Test void canPostOrder()
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
      assertEquals("[2, 9, 4, 5, 6, 8, 3, 1]", tree.postOrder().toString());
  }

  @Test void canLevelOrder()
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
      assertEquals("[1, 5, 3, 2, 4, 6, 8, 9]", tree.levelOrder().toString());
  }

  @Test void canGetHeight()
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
      assertEquals(4, tree.height());
  }
}
