class Pattern{
	public static void main(String []args){
	int num=9;
	int  ch = 65;
	for(int i=10;i>1;i--){
		if(i%2==0){
		 System.out.print(num + " ");
		 
		}
		else {
		
		 System.out.print((char)ch +" ");
		}
	
	 
	 num--;
	 ch++;
	}
	
	}

}
