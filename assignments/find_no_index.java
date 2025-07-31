/*problem statement:
 * given an integer array and another integer element . the task is to find if the given element is present in an array or not.
 *TC= O(n)
 SC = (1)
 * */

class Find_Element{
	public static void main(String []args){
	int arr[] = new int []{1,2,3,4};
	int x = 3;
	
	for (int i=0;i<arr.length;i++){
		if (arr[i]==x){
			System.out.println(arr[i]);
			 System.out.println("given element is present at the array of index:"+arr[i]);
			break;
		}
		else{
		continue;
		}
// System.out.println("given element is present at the array of index:"+arr[i]);
	}
//	System.out.println("given element is present at the array of index:"+arr[i]);
	}

}
