package Collections;

import java.util.ArrayList;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l1.addAll(0,l2);//list2 is indexed from 0 so list2 prints first later list1
			
		System.out.println("This arraylist prints first l2 and later l1");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
	}
		
	}
}
