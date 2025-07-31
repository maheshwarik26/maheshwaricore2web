package Stack;
import java.util.*;

public class DemoStack{
	public static void main(String [] rgs){
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		stack.pop();

	
	}

}
