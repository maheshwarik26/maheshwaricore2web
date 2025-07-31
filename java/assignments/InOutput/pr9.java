import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the initial number of range");
		int num1 = Integer.parseInt(br.readLine());
		 System.out.println("Enter the final number of range");
		 int num2 = Integer.parseInt(br.readLine());
		 for(int i=num1;i<=num2-1;i++){
			 if(i%2==0){
		 	System.out.println(i);
		 }
		 }

	
	
	}

}
