package practiseee;

public class Q4 {
	
private boolean substring(String str1) {

if(str1.contains("nd")==true) {
	return true;
}
return false;
	
}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		String str1="India";
		Q4 obj=new Q4();
		flag=obj.substring(str1);
		System.out.println(flag);
}
}