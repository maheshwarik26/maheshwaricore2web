import java.io.*;
class Demo{

void fun()throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter integer value of x:");
int x = Integer.parseInt(br.readLine());

System.out.println("Enter value for y");
int y = Integer.parseInt(br.readLine());
try{
System.out.println(x/y);
}catch(ArithmeticException ae){
	System.out.println("Exception handled");
}

}
public static void main( String [] args)throws IOException{
Demo obj = new Demo();
obj.fun();
//stem.out.println(x/y);
}
}
