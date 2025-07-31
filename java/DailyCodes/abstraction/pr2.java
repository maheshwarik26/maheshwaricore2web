interface Parent {
void career();
void marry();

}
class Child implements Parent{
 public void career (){
System.out.println("Reel star");
}
public void marry(){
System.out.println("mamachi porgi");
}
}
class Client{
public static void main(String []args) {
Parent obj = new Child();
obj.career();
obj.marry();
}

}
