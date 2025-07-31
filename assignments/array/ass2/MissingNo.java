import java.util.*;

class MissingNo{

	static int findmissing(int arr[], int n){
		int totalSum = n*(n+1)/2;
		int arraySum = 0;

		for(int num : arr){
		arraySum += num;
		}
		return totalSum - arraySum;
	
	}

	public static void main(String [] args){
		int arr[] = new int[]{1,3,2,5,6,7,8,11,10,4};
		int n = 11;
		int missing = findmissing(arr , n);
		System.out.println("The missing element is:"+ missing);
	
	}
}
