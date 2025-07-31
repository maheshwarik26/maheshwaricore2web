class CountPair{

	static int countPair(int arr[], int N,int K){
		int count[] = new int [10001];
		int pair = 0;
	  
		for(int i = 0;i<N;i++){
			int need = k - arr[i];

			if(need >=0 && need <= 10000){
				pair += count[need];
			}
			count[arr[i]]++;
		}	
		return pairs;
	
	}
	public static void main(String [] args){
		int arr[] = new int[]{1,1,1,1};
		int N = arr.length;
		int k = 2;
		countPair(arr,k);
	}
}
