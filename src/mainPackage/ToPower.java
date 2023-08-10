package mainPackage;

public class ToPower {

	public static void main(String[] args) {
		
		/* Write a public static method called "toPower" that 
		 * takes in as parameters two integers called size and power. 
		 * The method should return an array of size "size" with each 
		 * array index raised to the value of "power." So, for example, 
		 * if we passed in "size = 4" and "power = 2" to the "toPower," 
		 * the method should return the following result: [0,1,4,9].*/
		
		int size = 4;
        int power = 2;
        int[] result = toPower(size, power);

        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] toPower(int size, int power) {
        int[] result = new int[size];
        
        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.pow(i, power);
        }
        
        return result;
	}
	
}
