import java.util.Scanner;
class OccurrenceRecursion {

	    // Recursive method to count occurrences
	        static int countDigit(int num, int digit) {
	                 if (num == 0)
	                            return 0;
	    
	                                     int lastDigit = num % 10;
	    
	                                             if (lastDigit == digit)
	                                                         return 1 + countDigit(num / 10, digit);
	                                                                 else
	                                                                             return countDigit(num / 10, digit);
	                                                                                 }
	  
	            public static void main(String[] args) {
	                         Scanner sc = new Scanner(System.in);
	    
	                                                                                                     // Input the number
	                         System.out.print("Enter a number: ");
	                         int number = sc.nextInt();
	                                                                                          // Input the digit to count
	                       System.out.print("Enter the digit to count (0-9): ");
	                            int digit = sc.nextInt();
	    
	                                 // Special case: if number is 0 and digit is 0
	                                      if (number == 0 && digit == 0) {
	                                    System.out.println("Digit 0 occurs 1 time in number 0.");
	                                      } else {
	                                  int result = countDigit(number, digit);
	                                     System.out.println("Digit " + digit + " occurs " + result + " times in number " + number + ".");
	                                                                                                                                                                                                                 }
	                                                                                                                                                                                                                     }
	                                                                                                                                                                                                                     }
	                                                                                                                                                                                                                   
