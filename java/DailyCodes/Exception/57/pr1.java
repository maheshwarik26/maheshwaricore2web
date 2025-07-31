import java.io.*;
class Demo{
void fun()throws IOException, ArithmeticException, NumberFormatException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value for x:");
int x = Integer.parseInt(br.readLine());
System.out.println("Enter value for y:");
int y = Integer.parseInt(br.readLine());
System.out.println(x/y);
System.out.println("end code");
}

public static void main(String []args)throws IOException , ArithmeticException, NumberFormatException{
Demo obj = new Demo();
obj.fun();
}

}
