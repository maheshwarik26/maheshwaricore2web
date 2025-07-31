class BubbleSort{
	void bubblesort(int arr[]){

	int n = arr.length;

	for(int i = 0; i<n;i++){
		for(int j=0;j<n-1-i;j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	}

	void printArray(int arr[]){
		int n = arr.length;
		for(int i = 0; i<n;i++){
			System.out.println(arr[i] + "");
			System.out.println();
		}
	}
	



	public static void main(String []args){
		BubbleSort obj = new BubbleSort();
		int arr[] = {64,34,25,12,22,11,90};
		int n = arr.length;
		System.out.println("Unsorted Array");

		obj.printArray(arr);
		obj.bubblesort(arr);
		
	System.out.println("Sorted Array");
	obj.printArray(arr);	
	
	}

}
