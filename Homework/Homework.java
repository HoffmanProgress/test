/*
kjhklhlkjhlkjhk
 * Homework 1 Part 1
 * Version 1.0
 * Aaron Hoffman
 * 5/29/18 01:30
 * Modifies and prints various arrays of integers
 */

public class Homework {

	public static void main(String[] args) {
		
		
		//Goooo
		int [] a = {12,23,54,43,12,76,45,32,55,19};
		int [] b = {5,4,3,2,6,8,1,10};
		int [] c = {17, 32, 4, 3, 8};
		// testing oddEvenArray
		displayArray(a); // print: 12,23,54,43,12,76,45,32,55,19
		oddEvenArray(a);
		displayArray(a); // print: 1,0,1,0,1,0,1,0,1,0
		// testing selectionSort
		displayArray(b); // print: 5,4,3,2,6,8,1,10
		selectionSort (b);
		displayArray(b); // print: 10,8,6,5,4,3,2,1
		// testing fibonacci
		System.out.println (fibonacci (7)); //print: 13
		c[0] = fibonacci (c[0]);
		c[1] = fibonacci (c[2]);
		c[2] = fibonacci (c[3]);
		displayArray(c); // print: 1597,3,2,3,8

	}
	
	//Changes an array's values to 1's and 0's based on if index position is even(1)
	//or odd(0)
	private static void oddEvenArray(int[] intArray) {
		
		int i = 0;
		int length = intArray.length;
		
		while (i < length) {
			
			if (i % 2 == 0)
				intArray[i] = 1;
			else
				intArray[i] = 0;
			
			i++;
		}
	}
	
	//Prints the contents of an array onto a single line with comma's between values
	private static void displayArray(int[] intArray) {
		
		int length = intArray.length;
		
		for(int i = 0; i < length; i++) {
			
			System.out.print(intArray[i]);
			
			if (i + 1 != length)
				System.out.print(",");
		}
		
		System.out.print("\n");
	}
	
	//Arranges the contents of an array from the largest value to smallest
	private static void selectionSort(int[] intArray) {
		
		int max = 0;
		int length = intArray.length;
		
		for (int i = 0; i < length - 1; i++) {
			max = i;
			for (int j = i + 1; j < length; j++) {
				if (intArray[j] > intArray [max])
					max = j;
			}
			
			int temp = intArray[max];
			intArray[max] = intArray[i];
			intArray[i] = temp;
		}
	}
	
	//Displays the nth number in the fibonacci sequence
	private static int fibonacci(int fibNumber) {
		if(fibNumber == 0)
	        return 0;
	    else if(fibNumber == 1)
	      return 1;
	    else
	      return fibonacci(fibNumber - 1) + fibonacci(fibNumber - 2);
	}
}
