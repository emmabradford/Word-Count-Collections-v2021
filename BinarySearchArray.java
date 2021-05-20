
/**
 * Write a description of class BinarySearchArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class BinarySearchArray<T extends Comparable<T>> implements WordCountCollection<T>
{
    //constructors
    List<T> arr;
    public BinarySearchArray()
    {
        arr = new ArrayList<T>();
    }
    
    // Returns the number of elements in this collection.
    public int size()
    {
        return arr.size();
    }
    
    // Returns true if this collection is empty; otherwise, returns false.
    public boolean isEmpty()
    {
        return arr.size() == 0;
    }

    // Adds element to this collection.
    // Precondition: element is not already in the collection
    public void add (T element)
    {
        int high = this.size();
        int low = 0;
        if (high == 0)
        {
            arr.add(0, element);
        }
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if (arr.get(mid).compareTo(element) < 0)
            {
                low = mid + 1;
            }
            else if (arr.get(mid).compareTo(element) > 0)
            {
            
            }
        }
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
        List<T> list = new ArrayList<T>();
        for (T element : list)
        {
            list.add(element);
        }
        return list;
    }
}
