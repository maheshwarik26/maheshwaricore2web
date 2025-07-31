/*sum of every single subarray with time complexity O(N)& without using extra space complexity (carry forward approach)
 *
 *
 * */

class Sum_sunarray{
	public static void main(String []args){
	int arr[] = new int []{2,4,1,3};
	int N = arr.length;
	for(int i=0;i<=N;i++){
		int sum = 0;
		for(int j=i;j<=N;j++){
		sum += arr[j];
		}
		System.out.println("sum of subarrray:"+sum);
	}
	}


}
