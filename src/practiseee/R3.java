package practiseee;

public class R3 {
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void setId(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R3 emp = new R3();
		emp.setName("Naruto");
		System.out.println(emp.getName());

		emp.setId(54503);
		System.out.println(emp.getId());
	}

}
