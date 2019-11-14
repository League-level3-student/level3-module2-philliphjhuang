package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] intArray) {
		boolean CNM = false;
		for(int i = 0 ; i < intArray.length-1 ; i++) {
			if(intArray[i+1]>=intArray[i]) {
				CNM = true;
			} else {
				CNM = false;
				break;
			}
		}
		return CNM;
	}
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] doubleArray) {
		boolean  WDNMD = false;
		for(int i = 0 ; i < doubleArray.length-1 ; i++) {
			if(doubleArray[i+1]>=doubleArray[i]) {
				WDNMD = true;
			} else {
				WDNMD = false;
				break;
			}
		}
		return WDNMD;
	}
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char[] charArray) {
		boolean  SB = false;
		for(int i = 0 ; i < charArray.length-1 ; i++) {
			if(charArray[i+1]>=charArray[i]) {
				SB = true;
			} else {
				SB = false;
				break;
			}
		}
		return SB;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	public static boolean stringArraySorted(String[] stringArray) {
		boolean  NMSL = false;
		for(int i = 0 ; i < stringArray.length-1 ; i++) {
			if(stringArray[i+1].compareTo(stringArray[i])>=0) {
				NMSL = true;
			} else {
				NMSL = false;
				break;
			}
		}
		return NMSL;
	}
	
	
	
	
	
	
	
	
	
}
