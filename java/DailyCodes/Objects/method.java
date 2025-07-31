class One{
	int x = 10;
	static int y = 20;
	void fun(){
			System.out.println("In fun method");
	}
	static void run(){
			System.out.println("In run method");		
	}


	public static void main(String [] args){
	 One obj = new One();
	 
	 System.out.println(obj.x);
	  System.out.println(y);
	  obj.fun();
	  run();

	  Two tw = new Two();
	  tw.gun();
	
	}


}
class Two{
		void gun(){
		System.out.println("in gun");
		}

}
