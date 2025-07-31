// implement circular queue

import java.util.*;

class CircularQueue{
	int queueArr[];
	int front;
	int rear;
	int maxSize;
	CircularQueue(int size){
	this.queueArr = new int[size];
	this.front = -1;
	this.rear = -1;
	this.maxSize = size;
	
	}

	void enqueue(int data){
		//check if the queue is full
		if((front ==0 && rear ==maxSize-1 ) ||((rear +1) % maxSize ==front)){
		 System.out.println("Queue is full");
		 return;
		}else if (front ==-1){
		
		//if the queue is initially empty
		front = rear = 0;
		}else if(rear ==maxSize-1 && front!= 0){
			//if the rear is at the end and there is space at the begining
			rear = 0;
			
		}else{
			//normal case move the rear pointer
			rear ++;
		}


		//enqueue thw data
		queueArr[rear] =data;
	
	}


	int dequeue(){
		//check if the queue is empty
		if(front == -1){
		System.out.println("queue is empty");
		return -1 ;
		}else {
		
		//dequeue the element at the front
		int ret  = queueArr[front ];
		//adjust front and rear pointers
		if(front == rear){
			rear =  front = -1;
		}else if(front == maxSize -1){
		front =0;
		}else{
		
			// noraml case move the front pointer
			front++;
		}return ret;
		}
	
	}

	void printQueue(){
	//print the elemen in the queue
		if(front <= rear){
			for(int i = front;i<=rear;i++){
			 System.out.print(queueArr[i] + " ");
			}
		}else{//
		      //print element from front to end then from the beggining to rear
			for(int i = front; i<maxSize;i++){
			
				System.out.print(queueArr[i]+ " ");
			}
			for(int i =0;i<=rear;i++){
			 System.out.print(queueArr[i]+ " ");
			}
		} System.out.println();//print a new line after printing the queue
	}


}
class Client{
	public static void main (String [] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size = sc.nextInt();

		CircularQueue cq = new CircularQueue(size);


		char ch;

		do{
		
		 System.out.println("1.Enqueue"); 
		  System.out.println("2.Dequeue");
		System.out.println("3. Print Queue");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Enter data to enqueue:");
				int data = sc.nextInt();
				cq.enqueue(data);
				break;
			
			
			}
			case 2:{
				int ret = cq.dequeue();
				if(ret!= -1){
					System.out.println(ret + "poppped");
				}
				break;
			
			
			
			}
			case 3:{
			
				cq.printQueue();
				break;
			
			
			}
			default:
			       System.out.println("wrong choice");
			       break;
		
		
		}





		System.out.println("do you want to continue?");
		ch = sc.next().charAt(0);



		}
		while(ch =='Y'|| ch =='y');
	}

}
