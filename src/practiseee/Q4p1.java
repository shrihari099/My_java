package practiseee;

import java.util.Scanner;

public class Q4p1 {

			
		private boolean substring1(String str,String str1) {

		if(str1.contains(str)==true) {
			return true;
		}
		return false;
			
		}
			public static  void main(String[] args) {
				// TODO Auto-generated method stub
				boolean flag;
				String str,str1;
				Scanner sc= new Scanner(System.in);	
				System.out.println("Enter Main String");
				str1= sc.nextLine();
				System.out.println("Enter sub String");
				str=  sc.nextLine();
				Q4p1 obj=new Q4p1();
				flag=obj.substring1(str,str1);
				System.out.println(flag);
		}
		

	}


