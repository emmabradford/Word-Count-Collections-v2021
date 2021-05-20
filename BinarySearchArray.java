
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
        int i = fetch(element, 0, size() - 1);
        arr.add(i, element);
    }
    
    // Returns the element of this colletion if contains an element e such that
    // e.compareTo(element) == 0; otherwise, returns null.
    public T fetch(T element)
    {
        int index = fetch(element, 0, size() - 1);
        if(index >= size())
            return null;
        T result = arr.get(index);
        if(result.compareTo(element) == 0)
            return result;
        return null;
    }
    
    private int fetch(T element, int first, int last)
    {
        int mid = (first + last) / 2;
        if (first > last)
            return first;
        int compare = element.compareTo(arr.get(mid));
        if (compare < 0)
            return fetch(element, first, mid - 1);
        else if (compare > 0)
            return fetch(element, mid + 1, last);
        return mid;
    }

    // Removes all elements in this collection
    public void clear()
    {
        while(!isEmpty())
        {
            arr.remove(0);
        }
    }
    
    // generates a list of the elements in the collection
    // Postcondion: list is independant (deep copy) of original collection
    public List<T> createList()
    {
        List<T> list = new ArrayList<T>();
        for (T element : arr)
        {
            list.add(element);
        }
        return list;
    }
}
