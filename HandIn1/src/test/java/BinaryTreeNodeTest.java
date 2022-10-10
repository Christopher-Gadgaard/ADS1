import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeNodeTest
{
  @Test
  public void canInsertAndRetrieveInteger()
  {
    BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>();
    node.setElement(5);
    assertEquals(5, node.getElement());
  }

  @Test
  public void canInsertAndRetrieveString()
  {
    BinaryTreeNode<String> node = new BinaryTreeNode<String>();
    node.setElement("Hello");
    assertEquals("Hello", node.getElement());
  }

  @Test void canAddLeftChildAsInteger()
  {
    BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>();
    node.setElement(5);
    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>();
    leftChild.setElement(3);
    node.addLeftChild(leftChild);
    assertEquals(3, node.getLeftChild().getElement());
  }

  @Test void canAddRightChildAsInteger()
  {
    BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>();
    node.setElement(5);
    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>();
    rightChild.setElement(7);
    node.addRightChild(rightChild);
    assertEquals(7, node.getRightChild().getElement());
  }

  @Test void canAddLeftChildAsString()
  {
    BinaryTreeNode<String> node = new BinaryTreeNode<String>();
    node.setElement("Hello");
    BinaryTreeNode<String> leftChild = new BinaryTreeNode<String>();
    leftChild.setElement("World");
    node.addLeftChild(leftChild);
    assertEquals("World", node.getLeftChild().getElement());
  }

  @Test void canAddRightChildAsString()
  {
    BinaryTreeNode<String> node = new BinaryTreeNode<String>();
    node.setElement("Hello");
    BinaryTreeNode<String> rightChild = new BinaryTreeNode<String>();
    rightChild.setElement("World");
    node.addRightChild(rightChild);
    assertEquals("World", node.getRightChild().getElement());
  }

  @Test void canAddToChildOfChild()
  {
    BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>();
    node.setElement(5);
    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>();
    leftChild.setElement(3);
    node.addLeftChild(leftChild);
    BinaryTreeNode<Integer> leftChildOfLeftChild = new BinaryTreeNode<Integer>();
    leftChildOfLeftChild.setElement(1);
    node.getLeftChild().addLeftChild(leftChildOfLeftChild);
    assertEquals(1, node.getLeftChild().getLeftChild().getElement());
  }
}
