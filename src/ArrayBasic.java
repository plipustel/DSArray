
/** ARRAY IN JAVA
 * 
 *  @Author: Plipus Telaumbanua
 *  @LastModified: Nov 2023
 *  @Topic: One/Multi-Dimensional Array
 *  
 *  Array in Java is fixed size
 *  
 *  String[] name;
 *  name = new String[5];
 *  name[0] = "name1";
 *  name[1] = "name2";
 *  
 *  OR
 *  
 *  String[] name = new String[5];
 *  String[] name = {"name1", "name2"};
 *  
 * */


public class ArrayBasic {

	public static void main(String[] args) {
		
		/* ----- 1. The way of defining several data type of arrays  ----- */
		
		/* Initialization with value */
		
		/* Array as string */
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		/* Array as Integer */
		int[] nums = {2, 1, 3, 2, 4};
		
		/* Array Boolean */
		boolean[] status = {false, true};
		
		/* Array as Float */
		float[] weight = {1.23f, 22.11f, 23.13f, 32.12f}; // Note: The 'f' after each number denotes a float
		
		/* Array as Double */
		double[] precisions = {0.123, 0.310, 0.232, 0.133};
		
		/* Array as Char */
		char[] name = {'A', 'B', 'C', 'D'}; // Must with single quote, if double will treat it as string
	
		/* Initialization with allocation to memory */
		String[] fruits = new String[5]; // accepts 5 fruits
		
		/* Two-dimensional array */
		int[][] twoDimArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		

		
		/* ----- 2. Working with array  ----- */
		System.out.println("1. Cars Array:");
		/* Read array element for() loop */
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("2. Cars Array Foreach:");
		/* Read for() each */
		for(String c: cars) {
			System.out.println(c);
		}
		System.out.println("3. Array Boolean:");
		boolean isActivated = ( 1 > 2) ? status[1] : status[0];
		System.out.println(isActivated);
		
		/* Change array element */
		System.out.println("4. Change Array Element, After Changed:");
		cars[2] = "Toyota"; // New val
		/* Read array element for() loop */
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("5. Two-Dim Array:");
		for(int i = 0; i < twoDimArray.length; i++) {
			for(int j = 0; j < twoDimArray.length; j++) {
				System.out.println(twoDimArray[i][j]);
			}
		}
		System.out.println("6. Access An Element From Two-Dim Array:");
		System.out.println(twoDimArray[2][1]); // 
		
		System.out.println("7. String to Array");
		
		String str = "Hello World";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		
		char[] arrStr = str.toCharArray();
		for(char item : arrStr) {
			System.out.println(item);
		}
		
		
		
	}

}
