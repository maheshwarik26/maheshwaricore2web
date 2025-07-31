abstract class Parent{
void Career(){
System.out.println("Software Engg");

}
void marry(){
System.out.println("Aliya Bhat");
}
}

class Child extends Parent{
void marry(){
System.out.println("Disha Patni");
}
}
class Client{
public static void main(String []args){
Parent obj =new Child();
obj.career();
obj.marry();

}

}
