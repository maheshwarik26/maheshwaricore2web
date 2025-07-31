class LoopDemo{
	public static void main(String []args){
	
		int num =1;
		char ch = 'A';
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			if (i%2==0){
			System.out.print(ch++ +" ");
			  }
			else {
			System.out.print(num++ +" ");
			}
		
		
		}
	 System.out.println(" ");
	
	
	}
	}


}
