class c2w{
	static int sqrtNum(int num){
	int start = 1;
	int end = num;
	int ans = 0;

	while(start<=end){
	  int mid = (start+end)/2;
	  int sqr = mid*mid;
	
	    if(sqr ==num){
	       return mid;
	    }
	    if (sqr>num){
	    end = mid -1;
	    
	    }
	    else{
	      start=mid+1;
	      ans=mid;
	    }

	}
		return ans;
	
	}
	public static void main(String []args){
	  System.out.println(sqrtNum(100));


	
	}


}
