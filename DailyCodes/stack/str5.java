// parenthesis checker or valid parenthesis
//
import java.util.*;
import java.io.*;
class Parenthesis{

	boolean validParenthesis(String str){
	
		Stack<Character> stack = new Stack<>();

		for(int i = 0;i< str.length();i++){
			char ch = str.charAt(i);
			if(ch =='{' || ch == '(' || ch == '['){
			
				stack.push(ch);
			}else{
			
			
				if(!stack.empty()){
				
					char x = stack.pop();
					if((x =='[' && ch ==']') || (x =='(' && ch ==')') || (x=='{' && ch == '}')){
					
						return false;
					}
				
				}
			}
		}
		
		return stack.empty();

		}
	}



class Client{
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expression") ;
		String str = sc.next();
		Parenthesis obj = new Parenthesis();

		boolean ret = obj.validParenthesis(str);
		if(ret){
		
			System.out.println("Balanced");
		}else{
		
		
			System.out.println("not balanced");
		}
	
	
	}



}
