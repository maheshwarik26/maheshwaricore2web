/*problem statement:print the sum of every single subarray
 *
 * */

class Sum_subarray{
	public static void main(String [] args){
	int arr[] = new int[]{2,4,1,3};
	int sum = 0;
	for (int i=0;i<arr.length;i++){
		for (int j=i;j<arr.length;j++){
		
			sum = sum + arr[j];
			System.out.println("sum of subarrays are:"+sum);
		}
	}
	
	}

}
