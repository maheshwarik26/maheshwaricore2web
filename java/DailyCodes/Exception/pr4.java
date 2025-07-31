class Demo{

void fun()throws IOException{
System.out.println("In fun");
}
public static void main(String []args){
Demo obj = new Demo();
obj.fun();

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String str = br.readLine();
System.out.println(str); 

}
}
