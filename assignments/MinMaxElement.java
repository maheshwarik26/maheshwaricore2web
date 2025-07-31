/*find min and max element in java
 * TC = O(n)
 * SC = O(1)
 *
 * */

class MinMaxElement{
	public static void main (String [] args){
	int arr[] = new int []{3,2,1,1000,167};
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for (int i = 0;i<arr.length;i++){
		if (arr[i]>max){
			max = arr[i];
		}
	}  System.out.println("max element:"+max);
	for (int i = 0;i<arr.length;i++){
                if (arr[i]<min){
		        min = arr[i];
		
						                }
	       		              
		        }
 System.out.println("min element:"+min);	
	}
}
