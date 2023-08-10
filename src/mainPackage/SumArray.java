package mainPackage;

public class SumArray {

	public static void main(String[] args) {

		/*Write a program to sum all the values of a given Array in Java.*/
		int [] sumArray = {2,5,4,3,1,6};

		int sum = totalSum(sumArray);
		System.out.println("The sum of Array Elements: "+sum);
	}

	public static int totalSum(int[]array) {
		int sum = 0;
		for(int i =0; i< array.length; i++) {
			sum+= array[i];
		}
		return sum;
	}

}
