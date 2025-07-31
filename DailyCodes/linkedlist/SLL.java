
import java.util.*;

//node class to represent a node in the ll
class Node{
	int data;
	Node next = null;
	Node(int data){
	this.data = data;
	}
}

//SLL class to include various operation 
class SLL{
	Node head = null;
	// new node to begin LL
	
	void addFirst(int data){
	Node newNode = new Node(data);

	if(head==null){
	head = newNode;
	}else{
	newNode.next =head;
	head = newNode;
	}
	
	}

	void addLast(int data){
	Node newNode = new Node(data);

	if(head ==null){
	head = newNode;
	}else{
	Node temp = head;
	while(temp.next!=null){
	temp = temp.next;
	}
	temp.next = newNode;
	}
	}


	int countNode(){
	Node temp = head;
	int count = 0;
	while(temp!=null){
	count++;
	temp = temp.next;

	}return count;
	}

	void addAtPos(int pos,int data){
		if(pos<=0 ||pos>= countNode()+2){
			System.out.println("Wrong Input");
			return;
		}

		if(pos ==1){
			addFirst();
		}else if(pos==count()+1){
		addLast(data);
		}else{

	Node newNode = new Node(data);
	Node temp = head;


	while(pos-2!=0){
	temp = temp.next;
	pos--;
	}
	newNode.next = temp.next;
	temp.next = newNode;


	}
	}

	void delFirst(){
	if(head == null){
	System.out.println("Limked List is empty");
	return;
	}else{
	if(countNode()==1){
	head = null;
	}else{
	head = head.next;
	}
	
	}
	}


	void delLast(){
	if(head ==null){
	System.out.println("Wrong input");
	return;
	}
	if(countNode()==1){
	head = null;
	}else{
	Node temp = head;
	while(temp.next.next!=null){
	temp = temp.next;
	}
	temp.next = null;
	}
	
	}

	

	//delete a node at specified index
	void delAtPos(){
	if(pos <= 0 || pos>= countNode()+1){
		System.out.println("Wrong Input");
		                        return;
       	}
             if(pos ==1){
		 addFirst();
	     }else if(pos==count()+1){
		addLast(data);
	            }else{

		    Node newNode = new Node(data);
		Node temp = head;


	       while(pos-2!=0){
			       temp = temp.next;
			       pos--;
	       }
		   temp.next = temp.next.next;

	}
	}

	void printSLL(){
	if(head == null){
	System.out.println("ll is empty");
	}
	else{
	Node temp = head;

	while(temp != null){
	System.out.println(temp.data + "->");
	temp = temp.next;
	}
	System.out.println();
	}
	
	
	
	}

}
//client class to interact with the lland perform operation based on user input
class Client{
	public static void main(String [] arha){
		SLL sll = new SLL();
		sll.addFirst(10);
		sll.addFirst(20);
		 sll.addFirst(30);
		 sll.printSLL();
		sll.addLast(15);
		sll.printSLL();

		sll.addAtPos(5,25);
		sll.printSLL();
		sll.delFirst();
		sll.printSLL();
		char ch;
		do {
			System.out.pritln("1.addFirst");
			System.out.pritln("2.addLast");
			System.out.pritln("3.addAtPos");
			System.out.pritln("4.delFirst");
			System.out.pritln("5.delLast");
			System.out.pritln("6.delAtPos");
			System.out.pritln("7.CountNode");
			System.out.pritln("8.printLL");
		        System.out.pritln("Enter your Choice");
	                Scanner sc = new Scanner(System.in);
		        int choice = sc.nextInt();
		
		switch(choice){
			case 1:{
			System.out.println("Enter data");
			int data = sc.nextInt();
			sll.addFirst(data);
			
			}break;

			case 2 :{
                        System.out.println("Enter data");
                        int data = sc.nextInt();
                        sll.addlast(data);

                        }break;

			case 3:{
			System.out.println("Enter a  data");
			int data = sc.nextInt();
			System.out.println("Enter a  pos");
			 int pos = sc.nextInt();
			sll.addAtPos(pos,data);
			
			}break;

			case 4:
			       sll.delFirst();
			       break;

			case 5:
			       sll.delLast();
			       break;
			case 6:
			       {
		 	System.out.println("Enter a  pos");
			      int pos = sc.nextInt();
			      sll.delAtPos(Pos);
			       }

			 case 7:
			       {
				       int count =sll.countNode();
				       System.out.println(count);
			       }

			 case 8:
			       sll.printSLL();
			       break;
			 default:
			       System.out.println("wrong input");
			       break;


		
		}
		System.out.println("Do you want to continue?");
		ch= sc.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');

		
}}


