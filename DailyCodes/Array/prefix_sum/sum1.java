/* problem statement : print the sum of alll elements in the given array within a specific index of start and end
 * */

import java.util.*;
class PrefixSum{
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	 int []arr = new int[]{2,5,3,11,7,9,4};

	System.out.println("Enter Sstarting index:");
	int start = sc.nextInt();
		if(start>arr.length){
		System.out.println("not valid");
		}else{
		System.out.println("Starting element is:"+start);
		}


	System.out.println("Enter ending of an array");
	int end = sc.nextInt();
	System.out.println("Enter ending of an array");
	if(end>arr.length){
		     System.out.println("not valid");
	}else{
		    System.out.println("endting element is:"+end);
	}
										                
	       
	//int []arr = new int[]{2,5,3,11,7,9,4};
	int sum=0;
		for(int i = start;i<=end;i++){
		sum+=arr[i];
		}
		System.out.println("sum of array elements of given range:"+sum);
	
	}
}
