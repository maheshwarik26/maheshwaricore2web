class IfElseDemo{
public static void main(String []args){
int num = 0;
if(true){
	System.out.println(num++ + ++num + ++num + ++num);//9
}
System.out.println(num-10);//-6
if (num>0){

num = 10;

}
System.out.println(num);//10
}


}
