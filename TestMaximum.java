package com.assignment13.bridglabz;
//Refractor2
public class Uc4<T extends Comparable<T>> {
	
	public static <T extends Comparable<T>> T testMax(T... value) {
		T max = value[0]; // assume a is initially the largest

		for (int i = 1; i < value.length; i++) {
			if (value[i].compareTo(max) > 0) {
				max = value[i];
			}
		}
		System.out.println("Maximum Value is= " + max);
		return max; // returns the largest value
	}

	public static void main(String args[]) {
		
	System.out.println("Welcome to Generics Maximum Program");
	System.out.println("Maximum of Integers Numbers");
	System.out.println("Test case1\n Maximum of Numbers : 1 ,2 ,3  ");
	System.out.println(testMax(1, 2, 3));
	System.out.println("Test case2\n Maximum of Numbers : 5 ,9 ,3 ,6 ");
	System.out.println(testMax(5, 9, 3));
	System.out.println("Test case3\n Maximum of Numbers : 1, 2, 4, 7, 8");
	System.out.println(testMax(1, 2, 7));
	
	System.out.println("Maximum of Float Numbers");
	System.out.println("Test case1\n Maximum of Numbers : 4.1F, 2.4F, 3.8F ");
	System.out.println(testMax(4.1F, 2.4F, 3.8F,2.6F));
	System.out.println("Test case2\n Maximum of Numbers : 3.2F,4.8F, 3.7F, 3.6F ");
	System.out.println(testMax(3.2F, 4.8F, 3.7F, 3.6F));
	System.out.println("Test case3\n Maximum of Numbers :1.2F, 1.32F, 1.77F, 2.7F, 0.3F ");
	System.out.println(testMax( 1.2F,1.32F,1.77F,2.7F,0.3F));
	
	System.out.println("Maximum of Strings");
	System.out.println("Test case1\n Maximum of Strings : Peach, Apple, Banana, Pineapple");
	System.out.println(testMax("Peach","Apple","Banana","Pineapple"));
	System.out.println("Test case2\n Maximum of Strings : Apple, Orange, Banana, WaterMelon, Lemon");
	System.out.println(testMax("Apple","Orange","Banana","WaterMelon", "Lemon"));
	System.out.println("Test case3\n Maximum of Strings : Apple, Banana, Strawberry ");
	System.out.println(testMax("Apple","Banana","Strawberry"));
	}
}