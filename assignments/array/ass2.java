import java.util.*;
class Lsearch{
public static void main (String []args){
	int arr[] = new int[]{1,3,2,5,6,7,8,11,10,4};
	int target = 11;
	boolean found =false;

	for(int i = 0; i<arr.length;i++){
	if(arr[i]==target){
	System.out.println("NO.found at index:"+i);
	found = true;
	}
	
	}
	if(!found){
	System.out.println("no. not found");
	}


}

}
