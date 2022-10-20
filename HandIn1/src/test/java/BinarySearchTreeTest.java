import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest
{
  @Test void canCreateEmptyTree()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    assertNull(tree.getRoot());
  }

  @Test void canCreateTreeWithRoot()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    assertEquals(5, tree.getRoot().getElement());
  }

  @Test void canInsertElement()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    assertEquals(5, tree.getRoot().getElement());
    assertEquals(3, tree.getRoot().getLeftChild().getElement());
    assertEquals(7, tree.getRoot().getRightChild().getElement());
  }

  @Test void canInsertMultipleElements()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);
    assertEquals(5, tree.getRoot().getElement());
    assertEquals(3, tree.getRoot().getLeftChild().getElement());
    assertEquals(7, tree.getRoot().getRightChild().getElement());
    assertEquals(2, tree.getRoot().getLeftChild().getLeftChild().getElement());
    assertEquals(4, tree.getRoot().getLeftChild().getRightChild().getElement());
    assertEquals(6, tree.getRoot().getRightChild().getLeftChild().getElement());
    assertEquals(8, tree.getRoot().getRightChild().getRightChild().getElement());
  }

  @Test
  void CanRemoveElement()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.removeElement(3);

    assertEquals(5, tree.getRoot().getElement());
    assertEquals(7, tree.getRoot().getRightChild().getElement());
    assertNull(tree.getRoot().getLeftChild());
  }

  @Test
  void canFindMax()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);
    assertEquals(8, tree.findMax());
  }

  @Test
  void canFindMin()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);
    assertEquals(2, tree.findMin());
  }

  @Test
  void canCheckIfIsContained()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);
    assertTrue(tree.contains(5));
    assertTrue(tree.contains(3));
    assertTrue(tree.contains(7));
    assertTrue(tree.contains(2));
    assertTrue(tree.contains(4));
    assertTrue(tree.contains(6));
    assertTrue(tree.contains(8));
    assertFalse(tree.contains(1));
    assertFalse(tree.contains(9));
  }

  @Test
  void canBalance()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);
    tree.reBalance();
    assertEquals(5, tree.getRoot().getElement());
    assertEquals(3, tree.getRoot().getLeftChild().getElement());
    assertEquals(7, tree.getRoot().getRightChild().getElement());
    assertEquals(2, tree.getRoot().getLeftChild().getLeftChild().getElement());
    assertEquals(4, tree.getRoot().getLeftChild().getRightChild().getElement());
    assertEquals(6, tree.getRoot().getRightChild().getLeftChild().getElement());
    assertEquals(8, tree.getRoot().getRightChild().getRightChild().getElement());
  }



}
