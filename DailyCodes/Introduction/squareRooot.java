
class FindSqrt{
	static int squareRoot(int x){
	int num = 0;
	int count = 0;
	for(int i=1; i<=x/2;i++){
	  if(i*i <=x){
		 
	    num =i;

	  }
	  count++;
//	System.out.println(count);
	}
//	return num;
	 System.out.println(count);
	 return num;
	}
	public static void main(String [] args){
	System.out.println(squareRoot(100));
	}
	
	}


