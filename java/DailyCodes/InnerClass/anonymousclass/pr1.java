class Demo{
void fun(){
System.out.println("in fun ");
}
}
class Outer{
public static void main(String [] args){
Demo obj = new Demo(){
};
Demo obj2 = new Demo(){
};
}
}
