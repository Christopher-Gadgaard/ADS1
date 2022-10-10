public class BinarySearchTreeNode <E extends Comparable<E>> extends BinaryTreeNode <E>
{
  public BinarySearchTreeNode()
  {
    super();
  }

  public BinarySearchTreeNode(E element)
  {
    super(element);
  }

  public BinarySearchTreeNode(E element, BinarySearchTreeNode<E> leftChild,
      BinarySearchTreeNode<E> rightChild)
  {
    super(element, leftChild, rightChild);
  }

  public void setElement(E element)
  {
    this.element = element;
  }

  public E getElement()
  {
    return element;
  }

  public void addLeftChild(BinaryTreeNode <E> leftChild)
  {
    this.leftChild = leftChild;
  }

  public void addRightChild(BinaryTreeNode <E> rightChild)
  {
    this.rightChild = rightChild;
  }

  public BinaryTreeNode<E> getLeftChild()
  {
    return leftChild;
  }

  public BinaryTreeNode<E> getRightChild()
  {
    return rightChild;
  }
}
