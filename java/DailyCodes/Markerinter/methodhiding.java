 class Parent{
static	 int x = 10;
 static void fun(){
 System.out.println("In fun Parent");
 }
 
 }
class Child extends Parent{
static void fun(){
System.out.println("In fun Child");
}
int x = 20;
}
class Demo{
public static void main (String []args){
Parent obj = new Parent();
obj.fun();
System.out.println(obj.x);

Child obj1 = new Child();
obj1.fun();
System.out.println(obj1.x);

Parent obj2 = new Child();
obj2.fun();// here child method has to called because object is of cchild but method call is of parent thatis method hiding
System.out.println(obj2.x);
}

}
