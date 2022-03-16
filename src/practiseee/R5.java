package practiseee;
//import java.util.Scanner;

class  R5{
	private int radius;
	private int height;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

	public static void main(String[] args) {
		float pi=3.14f;
		R5 mycylinder = new R5();
		mycylinder.setRadius(5);
		mycylinder.setHeight(10);
		
	int h=mycylinder.getHeight();
	int j=mycylinder.getRadius();
	float v=(2*pi*h*j)+(2*pi*j*j);
	
	System.out.println("height is "+mycylinder.getHeight());
	System.out.println("radius is "+mycylinder.getRadius());
	System.out.println("area is "+v);
	}

	

}
