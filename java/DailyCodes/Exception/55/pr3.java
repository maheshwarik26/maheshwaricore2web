class DefaultHandling{
static void fun(int x, int y){
System.out.println("start fun");
System.out.println(x/y);
System.out.println("start fun");
}


public static void main(String []args){
int x=10;
int y=0;
System.out.println("start code");
fun(x,y);
System.out.println("end code");

}
}
