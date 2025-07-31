import java.io.*;
class BinarySearch{
static int binarysearch(int [] arr, int key)throws IOException{
	 int start = 0;
	 int end = arr.length-1;

	 
	 for (int i = 0; i<arr.length;i++){
	 int mid = (start + end) /2;
	 	
	 	if(arr[mid] == key){
		return mid;
		} 
		if(arr[mid] < key){
		start = mid + 1;
		}
		if(arr[mid] >key){
		end = mid - 1;
		

		}
	 }
	 
	 	return -1;
}



public static void main (String [] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter array size");
	int size = Integer.parseInt(br.readLine());

	int arr[] = new int [size];
	System.out.println("Enter an array elements");
	 	for (int i = 0 ; i<size;i++){
		arr[i] = Integer.parseInt(br.readLine());
		
		}
		System.out.println("Enter key number");
		int key = Integer.parseInt(br.readLine());
		 
		if (key == -1){
		System.out.println("key number notfound");
		
		}else{
		System.out.println("key number found at index:"+ binarysearch(arr,key));
		}

}
}
