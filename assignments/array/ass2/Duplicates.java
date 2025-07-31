import java.util.Arrays;

class Duplicates {
	    static void findDuplicates(int arr[]) {
	           Arrays.sort(arr);  
	           boolean found = false;
	             for (int i = 0; i < arr.length - 1; i++) {
		        if (arr[i] == arr[i + 1]) {
					                                                               if (i == 0 || arr[i] != arr[i - 1]) {
					                                                                                    System.out.println("Duplicate: " + arr[i]);
					                                                                                                        found = true;
					                                                                                                                        }
					                                                                                                                                    }
					                                                                                                                                            }
					       
					                                                                                                                                                    if (!found) {
					                                                                                                                                                                System.out.println("No duplicates found");
					                                                                                                                                                                        }
					                                                                                                                                                                           }
					       
					                                                                                                                                                                                public static void main(String[] args) {
					                                                                                                                                                                                        int arr[] = new int[]{2, 3, 1, 1, 2, 3};
					                                                                                                                                                                                               findDuplicates(arr);
					                                                                                                                                                                                                   }
					                                                                                                                                                                                                   }
					       






