package com.java.regularExpression;
import java.util.regex.*;
//import java.util.regex.Pattern;



public class A5 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("ab"); //pattern is object
		Matcher m= p.matcher("ababbaba"); //matcher is checking weather content p is matching m
		int count=0;// counts number of  times repetition of words
		while(m.find()) //.find searches p in m
		{
			System.out.println("starting index "+m.start()+" ending index "+m.end()+
					" char repeatation "+m.group());
			count++;

		}
		// m.start() returns only first index+1
		// m.end() returns only last index+1
		//m.group() returns group in char
		System.out.println("The number of occurance is "+count);
	}

}


