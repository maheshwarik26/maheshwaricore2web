class Demo{
void fun(){
System.out.println("In un - Demo");
}
}
class DemoChild extends Demo{
void fun(){
System.out.println("In fun Demochild");

}
void run (){
System.out.println("In run demochild");
}
}
class Outer{
public static void main (String []args){
Demo obj3 = new Demo(){};
obj3.fun();
}
}
