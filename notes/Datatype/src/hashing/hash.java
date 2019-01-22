package hashing;

import java.util.HashSet;
/*
 * variable: x, y, z (int, double...)
 * array: fixed length, same data type
 * class
 * ArrayList (maybe different type, flexible length)
 * LinkedList(easier to add/remove elements)
 * Set: no same element
 * HashMap: easy to remember..?
 */

public class hash {
	public static void main(String[] args){
		
		/*
		 * Hash set ---> HashSet is using a hash algorithm to store data
		 * in position related to data itself from a set
		 * 
		 * 
		 * 
		 * Set setA = new HashSet();
		 * String element = "element";
		 * 
		 * method: 
		 * add: add an element
		 * contains: check whether the element is contained
		 * 
		 * 
		 * You can also declare a HashSet using a generic type
		 * like, Set<Integer> (A set only containing integers)
		 * 
		 */
		HashSet test =  new HashSet<Integer>();
		test.add(11);
		test.add(24);
		test.add(85);
		test.add(47);
		test.add(44);
		test.add(46); //Can't save duplicate elements; 
		test.add("True");
		System.out.println(test); //Not in order as you add the elements; 
		
		
		/*
		 * Key values are assigned to elements in Hash Table using a hash Function
		 * A hash function helps to calculate the best index an item should go in
		 * A hash table stores the data derived from a hash function
		 * 
		 * HashTable<Integer: key, String: value> HtName = new HashTable();
		 * HashMap HtMap = new HashMap();
		 * 
		 * 
		 * HtName.put(32, "Bond");
		 * HtName.get(key);
		 * HtName.keySet(element); ---> check whether element is set a value
		 */
		
		
		
	}

}
