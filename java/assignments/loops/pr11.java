class Nested{
	public static void main(String []args){
	int num = 256;  //9185;
	int sum= 0;

	while(num>0){
	int digit = num % 10;
	if( digit %2 ==0){
	//System.out.print(digit*digit*digit);
	
	}

	sum+=digit;
	/*else{
	
	System.out.println("");
	}
*/
//	product*=digit;
	//System.out.print(product);
	num /=10;

	}
	System.out.print(sum);
	
	}

}
