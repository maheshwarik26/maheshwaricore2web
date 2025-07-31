class Outer{
Outer(){
	System.out.println("in outer constructor");



}
	class Inner{
		Inner(){
		System.out.println("In inner constructor");
		}
}
public static void main(String [] args){
Outer outobj = new Outer();
Inner obj = outobj.new Inner(); 

}


}
