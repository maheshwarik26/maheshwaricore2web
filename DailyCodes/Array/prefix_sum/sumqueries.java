/*  given an array of size N and Q number of queries. print sum of all elements in given subarrays
 * */

import java.util.*;
class Queries_Sum{
	public static void main(String [] mahi){
	
		Scanner sc = new Scanner(System.in);
		int arr[] = new int []{-3,6,2,4,5,2,8,-9,3,1};
		int Q= 3;
	for(int i = 0; i<Q ; i++){
		System.out.println("Enter starting index:");
		int start = sc.nextInt();
		System.out.println("enter ending index:");
		int end = sc.nextInt();
		int sum =0;

		for(int j=start;j<=end ;j++){
			sum += arr[j];
		
		}
		System.out.println("sum of subarray is:"+sum);
		
		}
	}


}
