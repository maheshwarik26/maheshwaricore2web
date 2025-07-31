class Outer{
Outer(){
System.out.println("outer constructor");

}
class Inner1{
Inner1(){
System.out.println("Inner 1 cnstructor");

}
class Inner2{
	Inner2(){
System.out.println("Inner2 constructor");
	}
}
}

public static void main(String []args){
Outer outobj = new Outer();
Inner1 obj1 = outobj.new Inner1();
//Inner2 obj2 = obj1.new Inner2();
//
//

Outer.Inner1 obj1 = new Outer().new Inner1();
Outer.Inner1.Inner2 obj2 = new Outer().new Inner1().new Inner2();

}

}
