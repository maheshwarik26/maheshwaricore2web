import java.io.*;
class InputDemo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                System.out.println("Enter your name");
		String name = br.readLine();
		//br.close();
		System.out.println("Enter society name");
		String socname = br.readLine();
		//System.out.println("Enter flat no.");
		//int flatno = Integer.parseInt(br.readLine());
		System.out.println("Enter wing name");
	        char wing = (char)br.read();// char-premitive data type, string- class
					    
                 br.skip(1);

		System.out.println("Enter FlatNo name");
                String FlatNo = br.readLine();
	       //
	       //
	       // 
  //it does not wait to take input from user because /n is stored in buffered reader it rea//ds this and print null		
	}
}
