/*find argest element
 *
 *
 * */

class LargestElement{
	public static void main (String []args){
	int arr[] = new int []{1,2,0,3,2,4,5};
	int max = Integer.MIN_VALUE;
for (int i= 0;i<arr.length;i++){
	if(arr[i]>max){
	max = arr[i];
	}
}	
System.out.println("largest element of an array is:"+max);
	}
}
