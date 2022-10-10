
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>
{
  private boolean foundItem;

  public BinarySearchTree()
  {
    super();
  }

  public BinarySearchTreeNode<E> getRoot()
  {
    return (BinarySearchTreeNode<E>) root;
  }

  public boolean insert(E element)
  {
    BinarySearchTreeNode<E> newNode = new BinarySearchTreeNode<E>(element);
    if (root == null)
    {
      root = newNode;
      return true;
    }
    if (contains(element))
    {
      return false;
    }

    BinarySearchTreeNode<E> current = getRoot();
    while (true)
    {
      if (element.compareTo(current.getElement()) < 0)
      {
        if (current.getLeftChild() == null)
        {
          current.addLeftChild(newNode);
          return true;
        }
        else
        {
          current = (BinarySearchTreeNode<E>) current.getLeftChild();
        }
      }
      else if (element.compareTo(current.getElement()) > 0)
      {
        if (current.getRightChild() == null)
        {
          current.addRightChild(newNode);
          return true;
        }
        else
        {
          current = (BinarySearchTreeNode<E>) current.getRightChild();
        }
      }
      else
      {
        return false;
      }
    }
  }

  boolean removeElement(E element)
  {
    if (root == null)
    {
      return false;
    }


    if (!contains(element))
    {
      return false;
    }


    BinarySearchTreeNode<E> current = getRoot();
    BinarySearchTreeNode<E> parent = null;


    while (true)
    {
      if (element.compareTo(current.getElement()) < 0)
      {
        parent = current;
        current = (BinarySearchTreeNode<E>) current.getLeftChild();
      }


      else if (element.compareTo(current.getElement()) > 0)
      {
        parent = current;
        current = (BinarySearchTreeNode<E>) current.getRightChild();
      }
      else
      {
        break;
      }
    }

    if (current.getLeftChild() == null && current.getRightChild() == null)
    {
      if (parent == null)
      {
        root = null;
      }
      else if (parent.getLeftChild() == current)
      {
        parent.addLeftChild(null);
      }
      else
      {
        parent.addRightChild(null);
      }
    }
    else if (current.getLeftChild() == null)
    {
      if (parent == null)
      {
        root = current.getRightChild();
      }
      else if (parent.getLeftChild() == current)
      {
        parent.addLeftChild(current.getRightChild());
      }
      else
      {
        parent.addRightChild(current.getRightChild());
      }
    }
    else if (current.getRightChild() == null)
    {
      if (parent == null)
      {
        root = current.getLeftChild();
      }
      else if (parent.getLeftChild() == current)
      {
        parent.addLeftChild(current.getLeftChild());
      }
      else
      {
        parent.addRightChild(current.getLeftChild());
      }
    }
    else
    {
      BinarySearchTreeNode<E> successor = (BinarySearchTreeNode<E>) current.getRightChild();
      BinarySearchTreeNode<E> successorParent = current;
      while (successor.getLeftChild() != null)
      {
        successorParent = successor;
        successor = (BinarySearchTreeNode<E>) successor.getLeftChild();
      }
      if (successorParent.getLeftChild() == successor)
      {
        successorParent.addLeftChild(successor.getRightChild());
      }
      else
      {
        successorParent.addRightChild(successor.getRightChild());
      }
      current.setElement(successor.getElement());
    }
    return true;
  }

  E findMax()
  {
    if (root == null)
    {
      return null;
    }
    BinarySearchTreeNode<E> current = getRoot();
    while (current.getRightChild() != null)
    {
      current = (BinarySearchTreeNode<E>) current.getRightChild();
    }
    return current.getElement();
  }

  E findMin()
  {
    if (root == null)
    {
      return null;
    }
    BinarySearchTreeNode<E> current = getRoot();
    while (current.getLeftChild() != null)
    {
      current = (BinarySearchTreeNode<E>) current.getLeftChild();
    }
    return current.getElement();
  }

  boolean contains(E element)
  {
    foundItem = false;
    if (root == null)
    {
      return false;
    }
    BinarySearchTreeNode<E> current = getRoot();
    while (current != null)
    {
      if (element.compareTo(current.getElement()) < 0)
      {
        current = (BinarySearchTreeNode<E>) current.getLeftChild();
      }
      else if (element.compareTo(current.getElement()) > 0)
      {
        current = (BinarySearchTreeNode<E>) current.getRightChild();
      }
      else
      {
        foundItem = true;
        break;
      }
    }
    return foundItem;
  }

  void reBalance()
  {

  }

}
