interface Demo{
 void m1();
 void m2();
}
abstract class Demochild implements Demo{
public void m2(){
	System.out.println("in m2 demochild");

}

}
abstract class Demochild1 implements Demo{
public void m2(){
System.out.println("in m2-Demochild1");
}

}
/*class Demochild implements Demo{
public void m2(){
Systemm.out.println("In m2-demochild");
}
}*/

class Client{
public static void main (String []args){
//Demo obj = new Demochild();
//obj.m1();
//obj.m2();
//obj.m3();
}

}
