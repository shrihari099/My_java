package LinkedList;

	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;



	public class A5 {



	public static void main(String[] args) {
	//System.out.println("Enter the RE of mobile number-");
	Scanner sc = new Scanner(System.in);
	String strRE = "[a-zA-Z][a-zA-Z0-9_\\-\\.]+[@]+[a-z]+[\\.][a-z]{2,3}";
	Pattern p = Pattern.compile(strRE);
	System.out.println("Enter your gmail addrress-");
	String strMob = sc.nextLine();
	Matcher m = p.matcher(strMob);



	if (m.find()) {
	System.out.println("Correct");
	System.out.println(m.group());
	}
	else
	{
	System.out.println("Wrong Entry");
	}
	}



	}

