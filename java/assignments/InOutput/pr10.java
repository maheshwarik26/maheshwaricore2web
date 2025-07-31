import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter marks of s1 subject out of 100");
		int s1 = Integer.parseInt(br.readLine());
		System.out.println("Enter marks of s2 subject out of 100");
		                int s2 = Integer.parseInt(br.readLine());
				System.out.println("Enter marks of s3 subject out of 100");
				int s3 = Integer.parseInt(br.readLine());
				System.out.println("Enter marks of s4 subject out of 100");
				int s4 = Integer.parseInt(br.readLine());
				int total = s1+s2+s3+s4;
				System.out.println("total marks obtain:"+total);
	
	
	}


}
