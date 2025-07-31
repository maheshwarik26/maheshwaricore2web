// stack implementation using an array


import java.util.Scanner;
class StackUsingArray{
	int maxSize;
	int stackArr[];
	int top = -1;
	StackUsingArray(int size){
		this.stackArr = new int[size];
		this.maxSize = size;
	}

	void push(int data){
		if(top == maxSize-1){
			System.out.println("Stack overflow");
			
		}else{
		top++;
		stackArr[top] = data;
		}
	
	}


	boolean empty(){
	    return top ==-1;
	
	}

	int pop(){
		if(empty()){
			System.out.println("stack is empty");
			return -1;
		}else{
			int val = stackArr[top];
			top--;
			return val ;
		}
	}

	int peek(){
		if(empty()){
			System.out.println("stack is empty");
			return -1;
		}else{
			return stackArr[top];
		
		}
	
	}


	int size (){
		return top + 1;
	
	}

	void printStack(){
		if (empty()){
		System.out.println("stack is empty");
		
		}else{
			System.out.println("[");
			for(int i= 0; i<maxSize;i++){
				System.out.print(stackArr[top] + " ");
			
			}
			System.out.println("]");
		}
	
	
	}


}


class Client {

	public static void main(String [] args){
		System.out.println("Enter size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();


		StackUsingArray st = new StackUsingArray(size);



		char ch ;
		do{

			System.out.println("1.push");
			 System.out.println("2.pop");
			 System.out.println("3.peek"); 
			 System.out.println("4.size");
			  System.out.println("5.isEmpty");
			  System.out.println("6.printstack");
			   System.out.println("Enter your choice");


			   int choice = sc.nextInt();
			   switch(choice){
			   
			   	case 1:{
				
				 	System.out.println("Enter element to add:");

					int data = sc.nextInt();
					st.push(data);
					break;
				}case 2:{
				
					int popped = st.pop();
					if(popped!= -1){
						System.out.println("popped element:" + popped);
					}
					break;
				}
				case 3:{
					int peeked = st.peek();
					if(peeked!= -1){
					System.out.println("peeked element:"+peeked);
					}
					break;
				
				
				}
				case 4:{
					System.out.println("size of the Stack"+ st.size());
					break;
				
				}
				case 5:{
					 System.out.println("is stack empty"+ st.empty());
					 break;
				
				}
				case 6:{
				System.out.println(printStack());
					break;
				
				}
				default:{
				 System.out.println("Wrong input");
				 break;
				
				}
			   }

				 System.out.println(" Do you want to continue?");
				 ch = sc.next().charAt(0);

			   
			   
		}while(ch =='y' || ch =='Y');
	
	}

}
