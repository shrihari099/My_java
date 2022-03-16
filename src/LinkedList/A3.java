package LinkedList;

import java.util.ArrayDeque;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ArrayDeque<Integer> ad2 = new ArrayDeque<>();
		ArrayDeque<Integer> ad3 = new ArrayDeque<>();
		ad1.add(6);
		ad1.add(56);
		ad1.add(9);
		ad1.addFirst(5);
		ad1.offerFirst(10);
		System.out.println(ad1);

		ad2.add(6);
		ad2.add(56);
		ad2.add(9);
		ad2.addLast(5);
		ad2.offerLast(10);
		System.out.println(ad2);

		ad3.add(6);
		ad3.add(56);
		ad3.add(9);
		ad3.add(10);
		ad3.add(91);
		ad3.add(19);

		System.out.println(ad3.getFirst());
		System.out.println(ad3.peekFirst());
		// getFirst() & peekFirst() methods are used to get the first element of the deque array.
		System.out.println(ad3.getLast());
		System.out.println(ad3.peekLast());
		//getLast() or peekLast() methods are used to print the last element of the deque array.


		//removeFirst() & pollFirst() methods are used to delete an element from the head of the queue.
		//.ad1 removeFirst() throws an exception if the queue is empty.
		//pollFirst() returns null if the queue is empty.
		ad3.pollFirst(); //deletes 6
		ad3.removeFirst(); //deletes 56
		System.out.println(ad3);

		ad3.pollLast(); //deletes 19
		ad3.removeLast(); //deletes 91
		System.out.println(ad3);
	}


}


