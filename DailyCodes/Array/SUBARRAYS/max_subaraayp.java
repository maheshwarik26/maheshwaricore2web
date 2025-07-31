class Maxsum{
	public static void main(String []args){
	int arr[] = new int []{-2,1,-3,4,-1,2,1,-5,4};
	int parr[] = new int[arr.length];
	parr[0] = arr[0];

	for (int i =1 ;i<arr.length;i++){
	parr[i] = arr[i] +parr[i-1];
	}
	
	int max = Integer.MIN_VALUE;
	for(int i =0;i<arr.length;i++){
		int sum = 0;
		for(int j= i;j<arr.length;j++){
		if (i==0)
			sum = parr[j];
		else
			sum =parr[j]-parr[i-1];

		if(sum>max)
			max = sum;
		}
	}	System.out.println(max);
	
	}
}
