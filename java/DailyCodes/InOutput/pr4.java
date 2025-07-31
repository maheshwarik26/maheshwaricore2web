import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter company name:");
		String comname= br.readLine();
		System.out.println("Emp name:");
		String empname= br.readLine();
		System.out.println("enter employ id");
	        int id = Integer.parseInt(br.readLine());

		System.out.println("company name:"+comname);
		System.out.println("emplloy name:"+empname);
		System.out.println("employ id:"+id);
	
	
	}



}
