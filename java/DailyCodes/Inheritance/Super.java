class Parent{
	int x= 10;
	Parent(){
	System.out.println("Parent Constructor");
	}

	void fun(){
	System.out.println("In fun Parent");
	}
	
	}

 class Child extends Parent{
 	int x = 20;
	Child() {
	
	System.out.println("In child Constructor");
	System.out.println(x);
	System.out.println(super.x);
	}
	void fun() {
	System.out.println("In fun-child");
	
	}
	public static void main(String []args){
	
	Child obj = new Child();
	}
 
 }
