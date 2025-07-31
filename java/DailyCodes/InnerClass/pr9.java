class Outer{
	class Inner{
	void run(){
	System.out.println("in run");
	}
	}
	void fun(){
	System.out.println("in fun");
	}
	public static void main(String []args){
	Outer obj = new Outer();
	obj.fun();
	Inner innerobj = obj.new Inner();
		innerobj.run();
	}

}
