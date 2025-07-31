import java.io.*;
import java.util.*;
class ScannerDemo{
	public static void main(String []args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferReader br = new BufferReader(isr);


		String name = br.readline();
		System.out.println("name :"+name);

		String compname = br.readline();
		System.out.println("compname :"+compname);

	}
}

