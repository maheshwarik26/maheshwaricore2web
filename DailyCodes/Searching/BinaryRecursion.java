class BinaryRecursion{
	int binaryrecursion(int arr[],int search,int start,int end){
	if(start >end){
	return -1;
	}else{
	
	int mid = (start +end )/2;
	if(arr[mid] == search){
	return mid;
	}
	if(arr[mid] > search){
	end = mid -1;
	}else{
	start = mid+1;
	}
	}
	
	return binaryrecursion(arr, search,start,end);
	}

public static void main (String [] args){
BinaryRecursion obj = new BinaryRecursion();
int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
int search = 7;
int index = obj.binaryrecursion(arr, search,0,arr.length-1);

	if (index ==-1){
	System.out.println("Element not found");
	}else{
	System.out.println("Element found at index:"+index);
	}

}
}
