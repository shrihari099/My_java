package practiseee;

import java.util.Scanner;


public class Q2 {
	int n=2;
	int m=3;

void Read(int[][] a ) {
	 Scanner sc= new Scanner(System.in);
	System.out.println(" enter the elements ");
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<m;j++) {
			 a[i][j]=sc.nextInt();
		 }
	 }
	 System.out.println("  the elements are");
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<m;j++) {
			 System.out.print(a[i][j]+"\t");
		 }
}
	 System.out.println("");
	 System.out.println("  the reverse elements are");
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<m;j++) {
			 System.out.print(a[i][j]+"\t");
		 }
		 System.out.println();
}
}

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int m=3;

		int a[][]=new int [n][m];
		Q2 obj= new Q2();
		obj.Read(a);
		
	}
}