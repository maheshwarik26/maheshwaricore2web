import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter initial number of range");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter final number of range");
		int num2 = Integer.parseInt(br.readLine());
		int sum =0;
		for(int i = num1-1;i<num2;i++){
	        sum = sum + i;
		}
		System.out.println(sum);
		//int total = i
		
	
	
	}

}
