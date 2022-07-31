package com.assignment13.bridglabz;

public class RefractorMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Welcome to Generics Maximum Program");
		Refractor1 obj = new Refractor1();
		
		System.out.println("\nMaximum of Integers Numbers");
		System.out.println("Test case1\n Maximum of Numbers : 1 ,2 ,3  ");
		System.out.println(obj.testMax(1, 2, 3));
		System.out.println("Test case2\n Maximum of Numbers : 5 ,9 ,3  ");
		System.out.println(obj.testMax(5, 9, 3));
		System.out.println("Test case3\n Maximum of Numbers : 1 ,2 ,7  ");
		System.out.println(obj.testMax(1, 2, 7));
		
		System.out.println("Maximum of Float Numbers");
		System.out.println("Test case1\n Maximum of Numbers : 4.1F, 2.4F, 3.8F ");
		System.out.println(obj.testMax(4.1F, 2.4F, 3.8F));
		System.out.println("Test case2\n Maximum of Numbers : 3.2F, 3.7F, 3.6F ");
		System.out.println(obj.testMax(3.2F, 3.7F, 3.6F));
		System.out.println("Test case3\n Maximum of Numbers :1.2F,1.32F,1.77F ");
		System.out.println(obj.testMax( 1.2F,1.32F,1.77F));
		
		System.out.println("Maximum of Strings");
		System.out.println("Test case1\n Maximum of Strings : Peach, Apple, Banana");
		System.out.println(obj.testMax("Peach","Apple","Banana"));
		System.out.println("Test case2\n Maximum of Strings : Apple, Orange, Banana ");
		System.out.println(obj.testMax("Apple","Orange","Banana"));
		System.out.println("Test case3\n Maximum of Strings : Apple, Banana, Strawberry ");
		System.out.println(obj.testMax("Apple","Banana","Strawberry"));

		
	}

}
