class StringDemo{
	public static void main(String []args){
	String str1 = "kanha";           //scp
	String str2 = new String("Ashish");//heap
	String str3 = "kanhaAshish";//scp
	String str4 = str1 + str2;//heap
	String str5 = str1.concat(str2);

	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);

	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));
	System.out.println(System.identityHashCode(str5));
	
	}


}
