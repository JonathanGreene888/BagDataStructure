package bagdatastructure;

import java.util.ArrayList;

import java.util.Iterator;

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


	@Override
	// Not sure what I am supposed to do with this. 
	public Iterator<T> iterator() {
        return items.iterator();
    }

}
