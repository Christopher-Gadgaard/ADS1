import java.util.ArrayList;

public class BinaryTree<E extends Comparable<E>>
{
  BinaryTreeNode<E> root;

  public BinaryTree(BinaryTreeNode<E> root)
  {
    this.root = root;
  }

  public BinaryTree()
  {
    this.root = null;
  }

  public BinaryTreeNode<E> getRoot()
  {
    return root;
  }

  public void setRoot(BinaryTreeNode<E> root)
  {
    this.root = root;
  }

  public Boolean isEmpty()
  {
    return root == null;
  }

  public int size()
  {
    return size(root);
  }

  private int size(BinaryTreeNode<E> node)
  {
    if (node == null)
    {
      return 0;
    }
    else
    {
      return 1 + size(node.getLeftChild()) + size(node.getRightChild());
    }
  }

  boolean contains(E element)
  {
     return contains(element, root);
  }

  private boolean contains(E element, BinaryTreeNode<E> node)
  {
    if (node == null)
    {
      return false;
    }
    else if (element.equals(node.getElement()))
    {
      return true;
    }
    else if (element.compareTo(node.getElement()) < 0)
    {
      return contains(element, node.getLeftChild());
    }
    else
    {
      return contains(element, node.getRightChild());
    }
  }

  ArrayList<E> inOrder()
  {
    if (isEmpty())
    {
      return null;
    }
    ArrayList<E> list = new ArrayList<E>();
    inOrder(root, list);
    return list;
  }

  private void inOrder(BinaryTreeNode<E> node, ArrayList<E> list)
  {
    if (node != null)
    {
      inOrder(node.getLeftChild(), list);
      list.add(node.getElement());
      inOrder(node.getRightChild(), list);
    }
  }

  ArrayList<E> preOrder()
  {
    if (isEmpty())
    {
      return null;
    }
    ArrayList<E> list = new ArrayList<E>();
    preOrder(root, list);
    return list;
  }

  private void preOrder(BinaryTreeNode<E> node, ArrayList<E> list)
  {
    if (node != null)
    {
      list.add(node.getElement());
      preOrder(node.getLeftChild(), list);
      preOrder(node.getRightChild(), list);
    }
  }

  ArrayList<E> postOrder()
  {
    if (isEmpty())
    {
      return null;
    }
    ArrayList<E> list = new ArrayList<E>();
    postOrder(root, list);
    return list;
  }

  private void postOrder(BinaryTreeNode<E> node, ArrayList<E> list)
  {
    if (node != null)
    {
      postOrder(node.getLeftChild(), list);
      postOrder(node.getRightChild(), list);
      list.add(node.getElement());
    }
  }

  ArrayList<E> levelOrder()
  {
    if (isEmpty())
    {
      return null;
    }
    ArrayList<E> list = new ArrayList<E>();
    ArrayList<BinaryTreeNode<E>> queue = new ArrayList<BinaryTreeNode<E>>();
    queue.add(root);
    while (!queue.isEmpty())
    {
      BinaryTreeNode<E> node = queue.remove(0);
      list.add(node.getElement());
      if (node.getLeftChild() != null)
      {
        queue.add(node.getLeftChild());
      }
      if (node.getRightChild() != null)
      {
        queue.add(node.getRightChild());
      }
    }
    return list;
  }



  int height()
  {  if (isEmpty())
  {
    return -1;
  }
    return height(root);
  }

  private int height(BinaryTreeNode<E> node)
  {
    if (node == null)
    {
      return 0;
    }
    else
    {
      return 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
    }
  }
}
