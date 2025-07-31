class StringDemo{
	public static void main(String []args){
	String str1 = "core2web";
	System.out.println(System.identityHashCode(str1));
	String str2 = "core2web";
	System.out.println(System.identityHashCode(str2));
	String str3 = new String("core2web");
	System.out.println(System.identityHashCode(str3));
	String str4 = new String("core2web");
	System.out.println(System.identityHashCode(str4));


	
	}


}
