class Nested{
	public static void main(String []args){

		int num = 1;
		int ch= 66;
	for(int i=0;i<4;i++){
	
		for(int j=0;j<3;j++){
                if(i%2==0){

 			if(j%2==0){
			System.out.print(num+ " ");
			num=num+2;
			}
			else{
			System.out.print((char)ch+ " ");
			ch = ch+2;
			}

		}
		else {
		
			if(j%2==0){
                        System.out.print((char)ch+ " ");
			ch = ch+2;
			}
			else{
			
				System.out.print(num+" ");
	                        num = num+2;
										                        }
	
		}
		}
		System.out.println();
		}
		}
	}
	
	


 
