class Outer{
class Inner{
Inner(){
	System.out.println("Inner constructor");
}
}
}
class Client{
public static void main(String []args){
Outer.Inner obj = new Outer().new Inner();


}

}
