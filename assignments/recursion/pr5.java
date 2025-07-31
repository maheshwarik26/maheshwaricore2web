class FindPrime{
	boolean isPrime(int num) {
			        if (num <= 1){
				return false;
				}
				for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0)
				return false;
							            }

					        return true;
						    
	
	}


	public static void main (String [] args){
		int num = 5;
		FindPrime obj = new FindPrime();
		obj.isPrime(num);


		 if (isPrime(num)) {
		System.out.println(num + " is a Prime Number.");
		 } else {
		System.out.println(num + " is NOT a Prime Number.");
								         }
	
	}

}
