package practiseee;

public class R1 {
	public int Area(int n,int m) {
		return n*m;
	}
	public int Perimeter(int a,int b,int c,int d) {
		return a+b+c+d;
	}
public static void main(String[] args) {
	R1 obj=new R1();
	
	int n=5,m=4;
	int w=obj.Area(n, m);
	System.out.println(w);
	
	int a=2,b=2,c=4,d=4;
	int l=obj.Perimeter(a, b, c, d);
	System.out.println(l);
	
	
}
}
