class TotalSum{
	public static void main(String [] args){
		int arr[] = new int []{1,2,3};
		int parr[] = new int [arr.length];
		parr[0]= arr[0];
		int totalsum = 0;
		for (int i= 1;i<arr.length;i++){
		parr[i] = parr[i-1] +arr[i];
		}

		for (int i = 0; i<arr.length;i++){
		int sum = 0;
			for (int j= i; j<arr.length;j++){
			sum +=arr[j];
			
			}totalsum += sum;
		
		}
		System.out.println(totalsum);
	}

}
