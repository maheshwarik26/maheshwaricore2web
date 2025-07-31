class SumDigit{
	
	int sumOfDigit(int  num){
	
		if (num ==0){
		return 0;
		}
		
		 return (num % 10) + sumOfDigit(num / 10);
		
	
	}

	public static  void main (String [] args){

		SumDigit obj = new SumDigit();
		int num = 3874;
		obj.sumOfDigit(num);
		System.out.println("sum of the digit is:"+ obj.sumOfDigit(num));
	
	}

}
