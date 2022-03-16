package practiseee;

public class Q7 {


	    static int add(int ...arr){
	        int result = 0;
	        for (int a : arr){
	            result = result + a;
	        }
	        return result;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println(add(1,2));
		    System.out.println(add(2,3,4));
		    System.out.println(add(4,5,6));
		}
		
	}


