package practiseee;

import java.util.Scanner;

 public class Q1 {
	public float sum(float[] a) {
		float sum1 = 0;
		for(int i=0;i<4;i++) {
			sum1=sum1+a[i];
		}
		return sum1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float a[]=new float[4];
float s=0;
Scanner sc= new Scanner(System.in);	
System.out.println("Enter numbers");
for(int i=0;i<4;i++) {
a[i]= sc.nextFloat();
	}
for(int i=0;i<4;i++) {
	Q1 obj = new Q1();
	s=obj.sum(a);
}
System.out.println("the addition is "+s);

	}

}