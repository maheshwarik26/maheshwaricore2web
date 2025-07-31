class IntegerCacheDemo{
	public static void main(String []args){
	int x = 66;
	int y = 65;
	int z = 67;
	
	char ch1 = 'A';
	char ch = 'B';
	char ch2 = 'a';
	System.out.println(System.identityHashCode(x));
	System.out.println(System.identityHashCode(y));
	System.out.println(System.identityHashCode(z));	
	System.out.println(System.identityHashCode(ch1));
	        System.out.println(System.identityHashCode(ch));
		        System.out.println(System.identityHashCode(ch2));
	}



}
