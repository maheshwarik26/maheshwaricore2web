/*given an array of size N find the contigous subarray which consiast of largest
 *subarray and print its sum
 * */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Max_subarraysum{

	static int sum(int arr[],int size){
	int max = Integer.MIN_VALUE;
	int start =-1;
	int end = -1;
	for (int i = 0;i<arr.length;i++){
		int sum = 0;
		for (int j=0; j<arr.length;j++){
			sum = sum +arr[j];
			if(sum >max){
			max = sum;
			start =i;
			end = j;
			}
		}
	}
	return max;
	}



	public static void main (String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an array size:");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int [size];
		System.out.println("Enter an array elements:");
		for (int i = 0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("the maximum subarray is:"+sum(arr,size));
	
	
	}

}
