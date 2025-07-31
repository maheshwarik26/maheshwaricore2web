     // reverse a string using stack
     //
     //
import java.util.*;
class RevString{
	String revString(String str){
		char stackArr [] = new char[str.length()];
		Stack<Character> stack = new Stack<> ();
		for(int i = 0;i<str.length();i++){
			stack.push(str.charAt(i));
		
		}
		int i = 0;
		while(!stack.empty()){
			stackArr[i] = stack.pop();
			i++;
		
		}
		return new String(stackArr);
	
	}


}

class Client{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse:");
		String str = sc.next();
		RevString obj = new RevString();
		String rev = obj.revString(str);
		System.out.println(rev);
		
		}
	
	
	}



