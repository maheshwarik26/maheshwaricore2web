import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		for(int i = 1;i<=10;i++){
			System.out.println(num*i);
	
           	}  

	}

}
