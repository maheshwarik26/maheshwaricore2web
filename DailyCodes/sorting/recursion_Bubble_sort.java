class RecursionBubbleSort{
	static int swapCount = 0;
	static void  bubblesort(int [] arr,int n){

	 
		if(n==1){
		return;
		}
		
		int localSwapCount = 0;
		
		for(int j=0; j<n-1;j++){
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1] = temp;
			localSwapCount++;
			
			}
		
		}
		if(localSwapCount == 0){
		return;
		
		}
		RecursionBubbleSort.swapCount += localSwapCount;

		bubblesort(arr, n-1);
	
	}

	public static void main(String [] args){
	 
		RecursionBubbleSort obj = new RecursionBubbleSort();

		int [] arr = {64,34,25,12,22,11,90};

		int n = arr.length;

	 obj.bubblesort(arr,n);
		System.out.println("Sorted Array:");
		

		for(int i:arr){
			System.out.print(i + " ");
		}

		System.out.println("\n Total Swaps:"+ obj.swapCount );
	
	}

}
