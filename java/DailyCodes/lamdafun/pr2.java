abstract class Demo{
abstract void m1();
}

class Outer{
public static void main (String []args){
Demo obj = new Demo(){  
void m1(){
System.out.println("In m1-outer$1");
}
};
obj.m1();
}
}
