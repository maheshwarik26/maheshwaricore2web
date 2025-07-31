class SumNum{

	int sum(int  n){
	
		if (n ==1){
		return 1;
		}
		//System.out.println(num);
		return n + sum(n-1);
	
	}

	public static  void main (String [] args){

		SumNum obj = new SumNum();
		int n = 10;
		obj.sum(n);
		System.out.println(obj.sum(n));
	
	}

}
