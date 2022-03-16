package LinkedList;

import java.util.LinkedList;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<>();

		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(77);

		l1.add(5,77); // Inserts 77 at index 5
		System.out.println("L1 Linked list : "+ l1);

		l1.remove(2);//removes 2nd index
		System.out.println("L1 Linked list : "+ l1);

		l1.set(2,1111110); //changes element present at 2nd index (33 changed to 10)
		System.out.println("L1 Linked list after: "  + l1);

		l1.addLast(100000); //Inserting 100 at the end of L1
		System.out.println("L1 Linked list after inserting element at last index: "  + l1);

		l1.addFirst(0007); //Inserting 0 at the starting of L1
		System.out.println("L1 Linked list after: "  + l1);
	}

}
