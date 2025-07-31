class Nested{
	public static void main(String []args){
	int num = 2469185;
	int sum =0;
	while(num>0){
	int digit = num%10;
	if(digit % 2 == 0){
	System.out.println("");
	}
	else{
	//System.out.println(digit);
	

	sum += digit*digit;}
	num/=10;
	}
	System.out.print(sum);
	
	}



}
