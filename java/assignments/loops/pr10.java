class Nested{
	public static void main(String []args){
	int num = 2569185;
	

	while(num>0){
	int digit = num % 10;
	if(digit % 3==0 || digit %2 ==0){
	System.out.print(digit);
	
	}
	/*else{
	
	System.out.println(digit);
	}*/
	num /=10;

	}
	
	}

}
