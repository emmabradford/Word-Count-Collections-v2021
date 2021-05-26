import java.util.*;
/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearchTree<T extends Comparable<T>> implements WordCountCollection<T>
{
    //constructors
    BinaryNode<T> root = null;

    // Returns the number of elements in this collection.
    public int size()
    {
        return size(root);
    }

    private int size(BinaryNode<T> r)
    {
        if(r == null)
        {
            return 0;
        }
        else
        {
            return 1 + size(r.getLeft()) + size(r.getRight());
        }
    }

    // Returns true if this collection is empty; otherwise, returns false.
    public boolean isEmpty()
    {
        return root == null;
    }

    // Adds element to this collection.
    // Precondition: element is not already in the collection
    public void add (T element)
    {
        root = add(element, root);
    }

    public BinaryNode<T> add(T element, BinaryNode<T> tree)
    {
        if(tree == null)
        {
            BinaryNode ans = new BinaryNode<T>(element);
            tree = ans;
        }
        else if(element.compareTo(tree.getInfo()) <= 0)
        {
            tree.setLeft(add(element, tree.getLeft()));
        }
        else
        {
            tree.setRight(add(element, tree.getRight()));
        }
        return tree;
    }
    // Returns the element of this colletion if contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns null.
    public T fetch(T element)
    {
        BinaryNode<T> a = fetch(element, root);
        if (a==null)
        {
            return null;
        }
        else
        {
            return a.getInfo();
        }
    }

    public BinaryNode<T> fetch(T element, BinaryNode<T> tree)
    {
        if(tree == null)
        {
            return null;
        }
        else if(element.compareTo(tree.getInfo()) < 0)
        {
            return fetch(element, tree.getLeft());
        } 
        else if(element.compareTo(tree.getInfo()) > 0)
        {
            return fetch(element, tree.getRight());
        }
        else
        {
            return tree;
        }
    }
    // Removes all elements in this collection
    public void clear()
    {
        root = null;
    }

    // generates a list of the elements in the collection
    // Postcondion: list is independant (deep copy) of original collection
    public List<T> createList()
    {
        List<T> a = new ArrayList<T>();
        inorderTraverse(root, a);
        return a;
    }
    
    private void inorderTraverse(BinaryNode<T> tree, List list)
    {
        if(tree != null)
        {
            inorderTraverse(tree.getLeft(), list);
            list.add(tree.getInfo());
            inorderTraverse(tree.getRight(), list);
        }
    }
}
