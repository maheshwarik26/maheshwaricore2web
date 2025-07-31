interface Demo{
	void fun(int x, int y);
	
	}
class Outer{
	public static void main(String[] args){
	Demo obj = (int x,int y)->{

	System.out.println("anonymous class");
	System.out.println(x+y);
	};
	obj.fun(10,20);
	}




}
