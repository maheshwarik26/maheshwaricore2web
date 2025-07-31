class Outer{

int x = 10;
static int y = 20;

Outer(){
System.out.println("Outer Constructr");
}

class Inner{
	int x = 30;
	Inner(int x){
	
		System.out.println("Inner constructor");
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(x);
	                System.out.println(Outer.this.x);
	}
}

	public static void main(String [] args){
	Outer outobj = new Outer();
	Inner obj = outobj.new Inner(120);

	
	}
}
