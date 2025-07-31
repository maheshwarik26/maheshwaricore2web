class NumLength{
	
	int lengthOfNum(int  num){
	
		if (num ==0){
		return 0;
		}
		
		return 1 + lengthOfNum(num/10);
		
	
	}

	public static  void main (String [] args){

		NumLength obj = new NumLength();
		int num = 3874;
		obj.lengthOfNum(num);
		System.out.println("length of the num is:"+obj.lengthOfNum(num));
	
	}

}
