package Collections;

import java.util.ArrayList;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> l1 = new ArrayList<>();
	        l1.add(1);
	        l1.add(2);
	        l1.add(3);
	        l1.add(4);
	        l1.add(6);
	        l1.add(5,5);  // inserts 5 at the 5th index in l1

	        System.out.println("Array list before : "+ l1);

	        l1.remove(0);
	        System.out.println("ArrayList after removing the value at index 0 :" + l1);
	        
	        System.out.println("L1 list contains 7 : " + l1.contains(4));
	        System.out.println("L1 list contains 4 : " + l1.contains(34));
	        
	}

	}


