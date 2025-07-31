import java.io.*;
class LinearSearch{
static int linearsearch(int [] arr, int key)throws IOException{
	for (int i=0;i<arr.length;i++){
	 if (arr[i] ==key){
	 
	 return i;
	 
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
		System.out.println("key number found at index:"+ linearsearch(arr,key));
		}

}
}
