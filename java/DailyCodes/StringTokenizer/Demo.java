// take input from user in only single line;
import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player info");
		String info = sc.next();
		StringTokenizer st = new StringTokenizer(info," ");
		//System.out.println(info);
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		String str3 = st.nextToken();
		String str4 = st.nextToken();
		
		System.out.println("playerName : "+ str1);
		 System.out.println("jerNo : "+ str2);
		  System.out.println("avg : "+ str3);
		   System.out.println("Grade : "+ str4);
	}

}
