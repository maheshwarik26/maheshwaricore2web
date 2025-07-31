class Demo{
	public static void main (String [] args){
		int arr[] = new int[]{-7,1,5,-4,-2,0};
		int totalsum = 0;

		for(int num:arr){
			totalsum+=num;
		}

		int leftsum = 0;

		for(int i=0;i<arr.length;i++){
		
			if(leftsum == totalsum - leftsum - arr[i]){
				System.out.println("Equilibrium index found at:" +i);
				return;
			}else{
				leftsum += arr[i];
			}

		}System.out.println(-1);
	}
}
