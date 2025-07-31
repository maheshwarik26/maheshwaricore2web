class LoopDemo{
public static void main(String []args){
int num = 5;
for(int i=1; i<50;i++){
	if (i%4==0 && i%5==0){
		System.out.println("***");
	continue;
	}
//num = num*i;
System.out.println(i);

}

}
}
