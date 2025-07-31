class LogicalCode{
public static void main(String[]args){
int x = 10;
int y = 11;
System.out.println((++x>=y)&&(x<++y));//false
System.out.println(x);//11
System.out.println(y);//12
}
}
