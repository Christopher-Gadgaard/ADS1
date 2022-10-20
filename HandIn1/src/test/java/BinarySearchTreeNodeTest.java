import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeNodeTest
{
  @Test
  public void canInsertAndRetrieveInteger()
  {
    BinarySearchTreeNode<Integer> node = new BinarySearchTreeNode<Integer>();
    node.setElement(5);
    assertEquals(5, node.getElement());
  }

  @Test
  public void canInsertAndRetrieveString()
  {
    BinarySearchTreeNode<String> node = new BinarySearchTreeNode<String>();
    node.setElement("Hello");
    assertEquals("Hello", node.getElement());
  }

  @Test void canAddLeftChildAsInteger()
  {
    BinarySearchTreeNode<Integer> node = new BinarySearchTreeNode<Integer>();
    node.setElement(5);
    BinarySearchTreeNode<Integer> leftChild = new BinarySearchTreeNode<Integer>();
    leftChild.setElement(3);
    node.addLeftChild(leftChild);
    assertEquals(3, node.getLeftChild().getElement());
  }

  @Test void canAddRightChildAsInteger()
  {
    BinarySearchTreeNode<Integer> node = new BinarySearchTreeNode<Integer>();
    node.setElement(5);
    BinarySearchTreeNode<Integer> rightChild = new BinarySearchTreeNode<Integer>();
    rightChild.setElement(7);
    node.addRightChild(rightChild);
    assertEquals(7, node.getRightChild().getElement());
  }

  @Test void canAddLeftChildAsString()
  {
    BinarySearchTreeNode<String> node = new BinarySearchTreeNode<String>();
    node.setElement("Hello");
    BinarySearchTreeNode<String> leftChild = new BinarySearchTreeNode<String>();
    leftChild.setElement("World");
    node.addLeftChild(leftChild);
    assertEquals("World", node.getLeftChild().getElement());
  }

  @Test void canAddRightChildAsString()
  {
    BinarySearchTreeNode<String> node = new BinarySearchTreeNode<String>();
    node.setElement("Hello");
    BinarySearchTreeNode<String> rightChild = new BinarySearchTreeNode<String>();
    rightChild.setElement("World");
    node.addRightChild(rightChild);
    assertEquals("World", node.getRightChild().getElement());
  }

  @Test void canAddLeftChildAsIntegerAndRetrieveIt()
  {
    BinarySearchTreeNode<Integer> node = new BinarySearchTreeNode<Integer>();
    node.setElement(5);
    BinarySearchTreeNode<Integer> leftChild = new BinarySearchTreeNode<Integer>();
    leftChild.setElement(3);
    node.addLeftChild(leftChild);
    assertEquals(3, node.getLeftChild().getElement());
  }

  @Test void canAddRightChildAsIntegerAndRetrieveIt()
  {
    BinarySearchTreeNode<Integer> node = new BinarySearchTreeNode<Integer>();
    node.setElement(5);
    BinarySearchTreeNode<Integer> rightChild = new BinarySearchTreeNode<Integer>();
    rightChild.setElement(7);
    node.addRightChild(rightChild);
    assertEquals(7, node.getRightChild().getElement());
  }

  @Test void canAddLeftChildAsStringAndRetrieveIt()
  {
    BinarySearchTreeNode<String> node = new BinarySearchTreeNode<String>();
    node.setElement("Hello");
    BinarySearchTreeNode<String> leftChild = new BinarySearchTreeNode<String>();
    leftChild.setElement("World");
    node.addLeftChild(leftChild);
    assertEquals("World", node.getLeftChild().getElement());
  }

  @Test void canAddRightChildAsStringAndRetrieveIt()
  {
    BinarySearchTreeNode<String> node = new BinarySearchTreeNode<String>();
    node.setElement("Hello");
    BinarySearchTreeNode<String> rightChild = new BinarySearchTreeNode<String>();
    rightChild.setElement("World");
    node.addRightChild(rightChild);
    assertEquals("World", node.getRightChild().getElement());
  }
}
