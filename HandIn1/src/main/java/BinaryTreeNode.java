public class BinaryTreeNode <E extends Comparable<E>>
{
  E element;
  BinaryTreeNode<E> leftChild;
  BinaryTreeNode<E> rightChild;

  public BinaryTreeNode()
  {
    this.element = null;
  }

  public BinaryTreeNode(E element, BinaryTreeNode<E> leftChild,
      BinaryTreeNode<E> rightChild)
  {
    this.element = element;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }

  public BinaryTreeNode(E element)
  {
    this.element = element;
    this.leftChild = null;
    this.rightChild = null;
  }

  public E getElement()
  {
    return element;
  }

  public void setElement(E element)
  {
    this.element = element;
  }

  void addLeftChild(BinaryTreeNode<E> leftChild)
  {
    this.leftChild = leftChild;
  }

  void addRightChild(BinaryTreeNode<E> rightChild)
  {
    this.rightChild = rightChild;
  }

  BinaryTreeNode<E> getLeftChild()
  {
    if (leftChild == null)
    {
      return null;
    }
      return leftChild;
  }

  BinaryTreeNode<E> getRightChild()
  {
    if (rightChild == null)
    {
      return null;
    }
    return rightChild;
  }
}
