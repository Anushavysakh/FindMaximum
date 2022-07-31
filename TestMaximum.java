package com.assignment13.bridglabz;

public class StringMaximum {

	public String maximum(String x, String y, String z) {

		String max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Generics Maximum Program");
		
		StringMaximum obj = new StringMaximum();
		
		System.out.println("Test case1\n Maximum of Apple, Peach, Banana");
		System.out.println(obj.maximum("Peach","Apple","Banana"));
		
		System.out.println("Test case2\n Maximum of Apple, Orange, Banana  ");
		System.out.println(obj.maximum("Apple","Orange","Banana"));
		
		System.out.println("Test case3\n Maximum of Apple, Banana, Strawberry");
		System.out.println(obj.maximum("Apple","Banana","Strawberry"));
	}

}
