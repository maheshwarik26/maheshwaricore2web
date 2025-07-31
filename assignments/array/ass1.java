import java.util.*;
class Lsearch{
	public static void main (String [] args){
	int arr[] =new int []{1,2,3,4} ;
	int n = 4;
boolean found = false;


	for (int i = 0;i<arr.length;i++){
	if(arr[i]==n){
	System.out.println("given number is present at index:"+arr[i]);
	found = true;
	break;
	}
	}
	if(!found){
	System.out.println("no.not found");
	
	}
	
//	System.out.println("number not found");
		
	
	
	}
}
