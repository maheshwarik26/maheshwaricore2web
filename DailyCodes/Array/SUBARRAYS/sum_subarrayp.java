/*problem satement:
 * sum of every subarray using PrefixSum
 *
  */

class Sum_subarrayp{
	public static void main(String []args){
	int arr[] = new int[]{2,4,1,3};
        int parr[] = new int [arr.length];
	for (int i=0; i<arr.length;i++){
		int sum = 0;
		for(int j=i;j<arr.length;j++){
			for (int k= 0;k<=j;k++){
				sum +=arr[k];
			}
		}
		System.out.println(sum);
	}
	}
}
