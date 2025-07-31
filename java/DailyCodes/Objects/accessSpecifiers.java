class One{
	 private int x = 10;
	 default int y = 20;
	private void fun(){
			System.out.println("In fun method");
	}
	default void run(){
			System.out.println("In run method");		
	}


/*	public static void main(String [] args){
	 One obj = new One();
	 
	 System.out.println(obj.x);
 	 System.out.println(obj.y);
	  obj.fun();
	  obj.run();

	  Two tw = new Two();
	  tw.gun();
	
	}*/


}
class Two{
		public static void main(String [] args){
			         One obj = new One();

				          System.out.println(obj.x);
					           System.out.println(obj.y);
						             obj.fun();
							               obj.run();

								                 

											           }

}
