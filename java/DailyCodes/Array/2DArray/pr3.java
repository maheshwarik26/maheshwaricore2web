import java.util.*;
class ArraySum{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for an array");
		int size = sc.nextInt();
		int arr[] =new int[size];
 
		for(int i =0;i<arr.length;i++){
			System.out.println("Enter a number:");
			arr[i] = sc.nextInt();
		//System.out.println(arr[i]);

			                }
		System.out.println("Array elements are :");
		for(int i =0;i<arr.length;i++){
	                System.out.println(arr[i]);
	                
		}

		int sum = 0;
		for(int i =0;i<arr.length;i++){
		sum = sum + arr[i];
		}
		System.out.println("Sum of all elements in an Array :"+ sum);
	
	}

}
