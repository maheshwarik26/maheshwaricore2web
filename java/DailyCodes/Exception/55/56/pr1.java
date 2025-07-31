import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class IOEDemo{
public static void main(String []args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first String");
String str = br.readLine();
br.close();
System.out.println("Enter second String");
String str2 = br.readLine();
}

}
