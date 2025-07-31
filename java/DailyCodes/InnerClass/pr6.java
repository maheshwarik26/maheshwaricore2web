class Outer{
	int x = 10;
//	static int y = 20;
Outer(){
System.out.println("In outer constructor");
System.out.println(x);
//System.out.println(y);
}

class Inner {
//	int x = 30;
	static int y = 40;
Inner(){
System.out.println("In Inner constructor");
System.out.println(x);
System.out.println(y);
}
}
public static void main(String [] args){
Outer outobj = new Outer();
Inner obj = new Outer().new Inner();
}


}
