package LinkedList;

import java.util.HashSet;


public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> myHashSet= new HashSet<>(6,0.7f);
		//			Inserting elements :
		//			add() method is used to add elements in HashSet.
		//			The insertion order of the elements does not remains preserved in HashSet.
		//			All the duplicate elements are ignored because the set contains only unique values.
		myHashSet.add(6);
		myHashSet.add(8);
		myHashSet.add(3);
		myHashSet.add(11);
		myHashSet.add(11); // This element will be ignored
		System.out.println(myHashSet);

		//	        Removing elements from the HashSet : 
		//	        remove() method is used to delete the specified element from the HashSet.
		//	        This method does not throws any exception if the specified element is not present 
		//	        in the HashSet.
		System.out.println("myHashSet before removing any element : " + myHashSet);
		myHashSet.remove(3); //deletes 3 from the hashset
		System.out.println("myHashSet after removing a element : " + myHashSet);

		//	     Checking if the HashSet is empty or not :  
		//	    	 isEmpty() method is used to check if there is any object in the HashSet or not.
		//	    	 This method returns a boolean value.
		//	    	 Example :
		HashSet<Integer> myHashSet1 = new HashSet<>(6, 0.5f);
		HashSet<Integer> myHashSet2 = new HashSet<>();
		myHashSet1.add(6);
		myHashSet1.add(8);
		myHashSet1.add(3);
		myHashSet1.add(11);
		System.out.println(myHashSet.isEmpty());
		System.out.println(myHashSet2.isEmpty());

		// clear() method is used to remove all the elements from the HashSet at once
		HashSet<Integer> myHashSet3 = new HashSet<>(6, 0.5f);
		myHashSet3.add(16);
		myHashSet3.add(33);
		myHashSet3.add(78);
		myHashSet3.add(19);
		myHashSet3.add(29);
		myHashSet3.add(10); 

		System.out.println("myHashSet before : " + myHashSet3);
		myHashSet3.clear(); //deletes all the elements from the hashset
		System.out.println("myHashSet after  : " + myHashSet3);
		// size() method is used to get the size of the HashSet
		System.out.println("The size of myHashSet is : " + myHashSet3.size());


	}

}
