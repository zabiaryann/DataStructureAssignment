package mainPackage;

public class WhatIsOutput {

	public static void main(String[] args) {

		//What is the output?
		// SOLUTION:
		/* The name exampleArray should be changed to examples
		 * Array. 
		 * After the correction the output would be number 2.
		 * */
		double[ ] examplesArray = {1,5,6,5,4,1};
		
		double maximum = examplesArray[0];
		
		int index = 0;
		
		for (int i = 1; i <examplesArray.length ; i++){
			
			if (examplesArray[ i ] > maximum) {
				maximum = examplesArray[ i ];
				index = i;
			}
		}
		System.out.println(index);
	}
}
