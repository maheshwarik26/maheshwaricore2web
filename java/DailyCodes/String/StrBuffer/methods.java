class StrMethods{
	public static void main(String []args){
		String str = "           Shashi       ";
		String str2 = "bagal";
		String str1 = new String("Shashi");
		System.out.println(str.concat(str2));
		System.out.println(str.length());
		System.out.println(str2.length());
		System.out.println(str.charAt(2));
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareTo(str1));

		System.out.println(str.equals(str1));// compares content
		System.out.println(str == str1);		// compare identityHashCode
								//
		System.out.println(str.indexOf('h')); // find first instance  of character
		System.out.println(str.indexOf('h',3)); //find index of char  from 
							
		System.out.println(str.replace('h','x'));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));


		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str.trim());
	}


}
