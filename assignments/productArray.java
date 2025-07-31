/*product of array element
 *
 * */
class Product_Elements{
	public static void main(String []args){
	int arr[] = new int []{1,2,3,4};
	int x = 1;
	for (int i=0;i<arr.length;i++){
	x *=arr[i];
	}
	System.out.println("product of an array :"+x);
	
	}
}
