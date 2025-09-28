package bagdatastructure;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.stream.Collectors;

//create a bag using an arraylist
//add in a add method that adds an element to the arraylist bag
//add in a remove method that removes an element from the arraylist bag
//add in a contains method to check if that value exists in the arraylist bag
//add in a count method to check the number of that specific element in the arraylist bag 


public class Bag<T> implements Iterable<T>  {
	
	private ArrayList<T> items;
	
	//** Creates a array list to be your bag **/
	public Bag() {
		items = new ArrayList<>();
	}
	
	//** Loops through the items and checks it against your entered item returns the count of the entered item **/
	public int count(T item) {
		int counter = 0;
		for (T currentItem : items) {
            if(currentItem == item) {
            	counter++;
            }
		}
            return counter;
	}
	 
	//** Adds the item to the items arraylist **/
    public void add(T item) {
        items.add(item);
    }
    
    //** Removes the item from items arraylist **/
    public boolean remove(T item) {
            return items.remove(item);
    }
    
    //** Checks if your arrylist bag contains the item entered **/
    public boolean contains(T item) {
        return items.contains(item);
    }
    
    // Create a size method that returns all the number of elements in the bag.
    public int size() {
    	return items.size();
    }
    
    // create a merge method to combine two bags together.
    public void merge(Bag<T> bag2) {
        for (T item : bag2) {
            this.add(item);
        }
    }
    
    // create a method that removes all duplicates and returns a new bag with only single instances
//    public Bag<T> distinct() {
//    	Bag<T> newBag = new Bag<T>();
//		for (T item: items) {
//			
//			// Doesn't work because contains uses equals and compares the place in memory not the content of that space. 
//    		if(!newBag.contains(item)) {
//    			newBag.add(item);
//    		}
//    	}
//    	return newBag;
//    }
	 public Bag<T> distinct() {
	        Bag<T> distinctBag = new Bag<>();
	        this.items.stream()
	                .distinct()
	                .forEach(distinctBag::add);
	        return distinctBag;
	    }


	@Override
	// Iterates over the items sort of like a loop except it can only go through one iteration. 
	public Iterator<T> iterator() {
        return items.iterator();
    }

}
