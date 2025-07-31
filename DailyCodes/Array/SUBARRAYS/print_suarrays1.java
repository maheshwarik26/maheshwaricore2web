
/*problem statement:
 * print the subarrays from given array
 */

class Print_Subarrays{
	public static void main(String []args){
	int arr[] = new int []{2,4,1,3};
	int sum = 0;
	for(int i = 0;i<arr.length;i++){
		for(int j=i;j<arr.length;j++){
			for(int k=i;k<=j;k++){
		//System.out.print(arr[k]);
		sum +=arr[j];
			}
			 System.out.println();
		}
		//System.out.println();

	}
	
	}


}
