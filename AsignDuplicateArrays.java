package week2.day2;

public class AsignDuplicateArrays {

	public static void main(String[] args) {
          int[] arr = new int[] {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
          //int length= arr.length;
          
		// declare an int variable named count
		//int count=0;
		System.out.println("Duplicate elements in given array:");
		// iterate from 0 to the array length-1 (outer loop starts here)
		{
		for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j])
			System.out.println(arr[j]);
		}	
		}
		}
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value

	}

}
