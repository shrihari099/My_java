package practiseee;

public class Q6 {
	int id;
	String name;
	float salary;
	public void print() {
		System.out.println("The name of Employee is "+name);
		System.out.println("The ID of Employee is "+id);
	}
	public float getsalary(){
		return salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Details of Employee is");
Q6 employee1=new Q6();
Q6 employee2= new Q6();

employee1.id=54503;
employee1.salary=100000.00022f;
employee1.name="Hulk";

employee2.id=54505;
employee2.salary=12130000.00022f;
employee2.name="Tony stark";

employee1.print();
float salaryy=employee1.getsalary();
System.out.println("the salary is "+salaryy);

employee2.print();
float salaryyy=employee1.getsalary();
System.out.println("the salary is "+salaryyy);






	}

}
