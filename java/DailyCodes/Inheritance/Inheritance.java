class Parent{
	int x = 10;
	int y = 20;
	
		Parent(){
		
			System.out.println("Parent constructor");
		
		}

}
class Child extends Parent{

	int x=30;
	int y = 40;
	Child(){
	System.out.println("Child constructor");
	}
	public static void main(String []args){
	
		Parent cobj = new Child();
		System.out.println(cobj.x);
		System.out.println(cobj.y);
	
	
	}

}
