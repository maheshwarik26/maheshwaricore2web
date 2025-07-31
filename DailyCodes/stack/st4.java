//merge two sorted array

 import java.util.*;
 class MergeStack{

	 Stack mergeStack (Stack s1, Stack s2){
	 
	 
		 Stack<Integer> s3 = new Stack<>();
		 

		 while(!s1.isEmpty() && !s2.isEmpty()){
		 
		 
			 if(s1.peek() > s2.peek()){
			 
				 s3.push(s1.pop());
			 }else{
			 
				 s3.push(s2.pop());
			 }
		 }
		 while(!s1.isEmpty()){
		 
			 s3.push(s1.pop());
		 }

		 while(!s2.isEmpty()){
			 s3.push(s2.pop());
	 }	
	 	while(!s3.empty()){
		
			s2.push(s3.pop());
		}
		return s2;
	 }
 }

class Client{

	public static void main (String [] args){
	
	
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		s1.push(10);
		s2.push(30);
		s1.push(50);
		s1.push(70);
		s2.push(20);
		s2.push(40);
		s2.push(60);
		s2.push(80);
		s2.push(100);

		MergeStack obj =new MergeStack();
		Stack s3 = obj.mergeStack(s1,s2);
		System.out.println(s3);
	}
		
}
		
