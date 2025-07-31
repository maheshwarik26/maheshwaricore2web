class Outer{
	int x =10;
	Outer(){
	System.out.println("In Outer costructor");
	}

	int fun(){
	System.out.println("In fun-method");
	return 1;
	}

class Inner{
	Inner(){
	System.out.println("In inner constructor");
	}


}
	int  run(){
	System.out.println("In run-method");
	return 2;
	}

public static void main(String []args){
Outer outobj = new Outer();
Inner obj = outobj.new Inner();
outobj.fun();
outobj.run();
System.out.println(outobj.x);

}


}
