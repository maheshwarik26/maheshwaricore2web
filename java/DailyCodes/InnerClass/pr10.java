class Outer {
void fun(){
System.out.println("In fun");
class Inner {
	Inner(){
	System.out.println("Constructor Inner");
	}
}
Inner obj = new Inner();
}
public static void main(String []args){
Outer obj = new Outer();
obj.fun();

}
}
