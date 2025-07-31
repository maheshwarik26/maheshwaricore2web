import java.util.*;
class ArrayDemo{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size for array and column:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		// insert array
		System.out.println("Enter array elements:");
			for(int i =0; i < arr.length; i++){
				for(int j =0; j<arr[i].length; j++){
					arr[i][j] = sc.nextInt();
				
				
				}
			
			}
			System.out.println("array elements are:");
			for(int i =0; i<arr.length; i++){
				for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
				}System.out.println();
			
			}
			System.out.println(arr[1][1]);
			 System.out.println(arr[1]);
			  System.out.println(arr);
	
	}


}
