class Nested{
	public static void main(String []args){
	int num = 9367924;
	int sum =0;
	int product =1;
	while(num>0){
	int digit = num%10;
	if(digit % 2 == 0){
	//System.out.println("");
	sum += digit;
	
	}
	else{
	//System.out.println(digit);
	product*=digit;

	}
	num/=10;
	}
	//```num/=10;
        System.out.println("sum of even"+sum);
	System.out.println("product of an odd"+product);
	
	}



}
