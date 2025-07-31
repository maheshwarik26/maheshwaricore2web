// ways to create string
class StringDemo{
	public static void main(String []args){
	//way 1
	String str = new String("Shashi");
	System.out.println(str);
	System.out.println(System.identityHashCode(str));
	//way2
	String str2 =new String("Shashi");
	System.out.println(str2);
	System.out.println(System.identityHashCode(str2));
	//way 3
	char arr[] = new char[]{'a','s','i','s','h'};
	System.out.println(arr);
	
	}


}
