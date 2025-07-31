import java.util.*;
class Node{
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right=null;
	}
}

class BinaryTree {
	Scanner sc = new Scanner(System.in);
	Node constructBT() {
		 System.out.println("Enter data for node");
				 int  data = sc.nextInt();
				 Node newNode= new Node (data);
				 System.out.println("Do you want  to add node to left side of:"+ newNode.data );
				 char leftNode = sc.next().charAt(0);

				 if(leftNode == 'y' || leftNode == 'Y'){
				 	 newNode.left = constructBT();
				 }
				  System.out.println("Do you want  to add node to right side of:"+ newNode.data);
				         char rightNode = sc.next().charAt(0);
                                                     
			   		 if(rightNode == 'y' || rightNode == 'Y'){										                                             newNode.right = constructBT();			 														                                      }
				 return newNode;
				 
	}

	void preOrderBT(Node root){
		if(root ==null)
			return;
		System.out.println(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);

	}
        void inOrderBT(Node root){
		                if(root ==null)
		                        return;
				        
			                inOrderBT(root.left);
					System.out.println(root.data + " ");
					inOrderBT(root.right);

					        }
        void postOrderBT(Node root){
	                if(root ==null)
			       return;
		                
			          postOrderBT(root.left);
				     postOrderBT(root.right);
					System.out.println(root.data + " ");

		      }


	public static void main (String []args){
		Node root = null;
		BinaryTree bt = new BinaryTree();
		root = bt.constructBT();
		
		System.out.println("PreOrder tree");
		bt.preOrderBT(root);

 System.out.println("InOrder tree");
                 bt.inOrderBT(root);

 System.out.println("postOrder tree");
                bt.postOrderBT(root); 
		
	}
}
