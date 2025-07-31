import java.util.*;

class Node{
	int data;
	Node next = null;
	Node prev = null;

	Node(int data){
	
	
		this.data = data;
	}


}

class DLL{
	Node head = null;

	void addFirst(int data){
	
		Node newNode = new Node(data);
		
		if(head == null){
		
			head = newNode;
			head.prev = head;
			head.next = head;
			return;
			
		
		}else{
			Node temp = head;
			while(temp.next!=null){
			
				temp = temp.next;
			}
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
		
		}
	
	
	}

	void addLast(int data){
	
		Node newNode = new Node(data);
		if(head == null){
		
			head = newNode;
			head.prev = head;
			head.next = head;
			return;
		
		}else{
			Node temp = head;
			while(temp.next!= null){
			temp = temp.next;
			
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			head.prev = newNode;
		
		}
	
	}

	int countNode(){
		Node temp = head;
		int count = 0;
		if(head ==null){
		
			return 0;
		}else{
		while(temp!= null){
			count++ ;
			temp = temp.next;

		}count++;
		return count;
		}
	}

	void addAtPos(int pos,int data){
	
		if(pos<=0 ||pos>= countNode() + 2){
		
			System.out.println("Wrong input");


		}
		if(pos ==1){
			addFirst(data);
		
		}else if(pos == countNode()+1){
		
			addLast(data);
		}else{
		
			Node newNode = new Node(data);
			Node temp = head;

			while(pos-2!=0){
			
				temp = temp.next;
				pos--;
			
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next =newNode;
		}
	
	}

	void delFirst(){
	
		if(head == null){
			System.out.println("Linked list is empty");
			return;
		}else if(head.next ==head){
			head = null;
		}
		else{
			Node temp = head;
			while(temp.next!=head){
			
				temp = temp.next;
			}
			head = head.next;
			temp.next =head;
			head.prev = temp;
			
			}
		
		
	
	}


	void delLast(){
		if(head ==null){
			System.out.println("Linked list is empty");
			return;
		
		
		}else if(head.next ==head){
		
			head =null;
		
		}else{
			Node temp = head;
			while(temp.next.next != head){
				temp = temp.next;
			
			}
			temp.next = head;
			head.prev = temp;
		
		}
		
		
	
	
	}

	void delAtPos(int pos){
		if(pos<=0 || pos>= countNode() +2){
			System.out.println("Wrong input");
			return;
		
		}
		if(pos==1){
		 
			delFirst();
		
		}else if(pos == countNode()){
			delLast();
		
		}else {
			Node temp = head;
			while(pos-2 ==0){
				temp = temp.next;
				pos--;
			
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		
		}
	
	
	
	}                    

	void printDCLL(){
	
		if (head ==null){
		
			System.out.println("LL is empty");
		
		}else{
		
			Node temp = head;
			while(temp!=null){
			System.out.println(temp.data + " ");
			temp= temp.next;
			}
		
		
		System.out.print("");
		}
	
	}

}



class Client{
	public static void main(String [] args){
		DLL dll = new DLL();

		char ch;
		do{
			
		System.out.println("1.addFirst");
		System.out.println("2.addLast");
		System.out.println("3.addAtPos");
		System.out.println("4.delFirst");
		System.out.println("5.delLast");
		System.out.println("6.delAtPos");
		System.out.println("7.countNode");
		System.out.println("8.PrintDLL");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch(choice){
		
			case 1:{
				System.out.println("Enter data");
				int data = sc.nextInt();
				dll.addFirst(data);
			
			}
			break;

			case 2:{
			
				       System.out.println("Enter data");
				       int data = sc.nextInt();
				       dll.addLast(data);
			
			}break;

			case 3:{
				System.out.println("Enter data");
				int data = sc.nextInt();
				System.out.println("Enter pos");
				int pos = sc.nextInt();
				dll.addAtPos(pos,data);
			
			
			}break;

			case 4:
			
				       dll.delFirst();
				       break;
			case 5:
				       dll.delLast();
				       break;

			case 6:{
				System.out.println("Enter pos");
				int pos = sc.nextInt();
				dll.delAtPos(pos);

			
			}break;

			case 7:{
				int count = dll.countNode();
				System.out.println(count);
			
			}break;

			case 8:
			       dll.printDCLL();
			       break;

			default:
			       System.out.println("Wrong input");
			       break;
	       		       
		}
		System.out.println("Do you want to continue?");
		ch= sc.next().charAt(0);
		}while(ch =='y' || ch == 'Y');
	
	}


}
