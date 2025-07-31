class Outer{
int x = 10;
static int y= 20;
Outer(){

System.out.println("outer constructor");
}

class Inner{
Inner(){
System.out.println("Inner constructor");
System.out.println(x);
System.out.println(y);
}

}

public static void main(String []args){
Outer obj1 = new Outer();
Inner obj =obj1.new Inner();

}
}
