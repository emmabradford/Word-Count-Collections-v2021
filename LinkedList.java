import java.util.*;
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList<T extends Comparable<T>> implements WordCountCollection<T>
{
    //constructors
    private LLNode<T> front;
    
    // Returns the number of elements in this collection.
    public int size()
    {
        LLNode<T> curr = front;
        int size = 0;
        while(curr != null)
        {
            size++;
            curr = curr.getLink();
        }
        return size;
    }
    
    // Returns true if this collection is empty; otherwise, returns false.
    public boolean isEmpty()
    {
        return front == null;
    }

    // Adds element to this collection.
    // Precondition: element is not already in the collection
    public void add (T element)
    {
        LLNode<T> newN = new LLNode(element);
        newN.setLink(front);
        front = newN;
    }
    
    // Returns the element of this colletion if contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns null.
    public T fetch(T element)
    {
        LLNode<T> curr = front;
        while(curr != null)
        {
            if(element.compareTo(curr.getInfo()) == 0)
            {
                return curr.getInfo();
            }
            curr = curr.getLink();
        }
        return null;
    }

    // Removes all elements in this collection
    public void clear()
    {
        front = null;
    }
    
    // generates a list of the elements in the collection
    // Postcondion: list is independant (deep copy) of original collection
    public List<T> createList()
    {
        LLNode<T> curr = front;
        List<T> a = new ArrayList<T>();
        while(curr != null)
        {
            a.add(curr.getInfo());
            curr = curr.getLink();
        }
        return a;
    }
}
