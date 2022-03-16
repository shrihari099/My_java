package practiseee;

public class Q3 {
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Lion123deer!23";
		int a = str.length();
		
		//System.out.println(a);
		//System.out.println(str.charAt(2));
		for(int i=0;i<a;i++) {
			char c=str.charAt(i);
			Character.isDigit(c);
		if(Character.isDigit(c)==true) {
			System.out.println(c+" is numeric value");
			}
		else {
			System.out.println(c+" Its char");
		}
		}
	}
}

	

