package com.javaguru.string;

public class StringDemo {
	
	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		
		System.out.println(s1==s2); // true as both reference points to same object in String pool
		System.out.println(s1.equals(s2));//true
		
		
		String s3= new String("abc");
		String s4= new String("abc");
		
		System.out.println(s3==s4);//false as both refers to two different objects in heap memory (reference not same)
		System.out.println(s3.equals(s4));// true as the equals method is overridden in String class to compare values and not reference
		
		System.out.println(s3==s1);//false one refers to heap object and other refers to pool object
		System.out.println(s3.intern()==s2);//true as intern helps to point to object in pool
		
		//i.e. if we write String s4= new String("abc").intern() it will refer to object in pool
		String s5= new String("abc").intern();
		
		System.out.println(s5==s1);//true
		System.out.println(s5==s2);//true
		
		String s6="abc";
		String s7="abcd";
		String s8=s6+"d";
		System.out.println(s8==s7);//false
		
		// String is immutable i.e. if we try to change the state of an object a new object will be returned
		
	}

}
