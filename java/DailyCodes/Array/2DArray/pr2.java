import java.util.*;
class ArrayDemo{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out .println("Enter size of an array");
	int size = sc.nextInt();
	String arr[] = new String[size];
	System.out.println("size of an array is :"+ size);


	for(int i=0;i<arr.length;i++){
	System.out.println("enter elements of an array");
	arr[i] = sc.next();
	
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	
	}
	}



}
