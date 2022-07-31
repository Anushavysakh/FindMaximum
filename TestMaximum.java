package com.assignment13.bridglabz;

//Uc1
public class TestMaximum {

	public Integer maximum(Integer x, Integer y, Integer z) {

		int max = x; 

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
     TestMaximum obj = new TestMaximum();
     System.out.println("Test case1\n Maximum of 1 ,2 ,3 : ");
     System.out.println(obj.maximum(1, 2, 3));
     System.out.println("Test case2\n Maximum of 5 ,9 ,3 : ");
     System.out.println(obj.maximum(5, 9, 3));
     System.out.println("Test case3\n Maximum of 1 ,2 ,7 : ");
     System.out.println(obj.maximum(1, 2, 7));

	}
}