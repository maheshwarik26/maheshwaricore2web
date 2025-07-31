class Demo {
void fun() {
System.out.println("In fun-Demo");
}
}
class Outer {
public static void main(String []args){
new DemoChild(){
void run (){
System.out.println("In run outer$1");
}
}.run();
}
}
