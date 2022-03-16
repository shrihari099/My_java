package practiseee;

import java.util.Scanner;

public class Q5 {
	private String numberToWord(int a) {
		String s = null;
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		String arrWords[]={"one","two","three","four","five","six","seven","eight","nine","zero"};
		for(int i=0;i<=9;i++) {
			if(arr[i]==a) {
			s=arrWords[i];
			}
	}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		String b;
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter number");
		a= sc.nextInt();
		Q5 obj=new Q5();
		b=obj.numberToWord(a);
		System.out.println(b);
	}

}
