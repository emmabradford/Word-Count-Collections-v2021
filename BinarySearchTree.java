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
        return root ==null;
    }

    // Adds element to this collection.
    // Precondition: element is not already in the collection
    public void add (T element)
    {
    
    }
    
    // Returns the element of this colletion if contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns null.
    public T fetch(T element)
    {
        return null;
    }

    // Removes all elements in this collection
    public void clear()
    {
    
    }
    
    // generates a list of the elements in the collection
    // Postcondion: list is independant (deep copy) of original collection
    public List<T> createList()
    {
        return null;
    }
}
