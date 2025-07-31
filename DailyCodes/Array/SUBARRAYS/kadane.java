class KadanesAlgo{

	int maxSum =arr[0];
	int sum =arr[0];

	for (int i=1;i<arr.length;i++){
	  if (sum<0){
	  sum = arr[i];
	  }else{
	    sum += arr[i];
	  }

	  if(sum>maxSum){
	  maxSum = sum;

	  }

	
	
	return maxSum;
}
public static void main(String []args){
	int arr[] =new int[]{-2,1,-3,4,-1,2,1,-5,4};

	System.out.println(maxSubarraySum(arr));
}
}
