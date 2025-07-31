class Reverse{
	public static void main(String [] args){
	
	int num = 123;
	int rev = 0;
	while(num!=0){
		int pop = num % 10;
		num /=10;

		rev = rev *10+ pop;
	}
	System.out.println("System.out.println"+ rev);
	}

}
