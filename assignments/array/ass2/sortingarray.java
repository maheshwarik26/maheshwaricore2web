class Sorting{
	static void sorting(int []arr){

		int min = Integer.MAX_VALUE;
		int n = arr.length;

		for(int i = 0;i<n;i++){
			
			for(int j = i+1; j<n;j++){
				if(arr[j]<min){
					min = arr[j];

				
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}

		System.out.println("Sorted Array is:");
		for(int num : arr){
		
			System.out.print(num + " ");
		}
		}

	public static void main(String[] args){
	int arr[] = new int[]{0,2,1,2,0};
		sorting(arr);
	
	
	}

}
