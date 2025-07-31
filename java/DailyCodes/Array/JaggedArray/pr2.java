import java.io.*;
class ArrayDemo{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size :");
		int arrsize = Integer.parseInt(br.readLine());
		int arr[] = new int[arrsize];
		System.out.println("Enter elements for array:");

		 for(int i =0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());



						                 }
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);

		
		
		}
	
	
	}


}
