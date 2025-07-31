class Outer {
int x = 10;
static int y = 20;
void  fun(){
System.out.println("In non static fun method");
}
static void run(){
System.out.println("In static method run");
}
static class Inner{
	static int y = 50;
Inner(){
System.out.println(y);
System.out.println(Outer.y);
run();

}

}
public static void main(String []args){
Outer.Inner obj = new Outer.Inner();

}

}
