package Collections;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println("The first arraylist");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		System.out.println("The second arraylist");
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}

	}

}
