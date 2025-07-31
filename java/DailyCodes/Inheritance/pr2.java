class Demo{
	int x = 10;
	int y = 20;
	Demo(int x,int y){
	System.out.println("In Constructor");
	System.out.println(x);
	System.out.println(y);
	x = x;
	y = y;
	}
	
	void printData(){
	
	System.out.println(this.x);
	System.out.println(this.y);
	}

}
class ConstrDemo{
	public static void main(String []args){
		Demo obj = new Demo(30,40);
		obj.printData();

	}

}
