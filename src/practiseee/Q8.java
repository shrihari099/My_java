package practiseee;

public class Q8 {
	int salary;
	String name;
	
	int getSalary() {
		return salary;
	}
	public void setName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8 employee= new Q8();
		
employee.salary=1000212;
int sal=employee.getSalary();
System.out.println(sal);

employee.name="shrihari";
employee.setName();

	}

}
