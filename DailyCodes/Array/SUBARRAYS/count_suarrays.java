/*problem statement:
 *	calculate the count of subarrays in the given array
 *
 */

import java.util.*;
class Count_Subarray{
	public static void main (String [] args){
	int arr[] = new int []{4,2,10,3,12,-2,15};
	int count = 0;
	for (int i = 0; i<arr.length;i++){
		for (int j= i;j<arr.length;j++){
		count++;	
		
		}
	
	}
	System.out.println("Total number of subarrays are:"+count);
	
	}

}
