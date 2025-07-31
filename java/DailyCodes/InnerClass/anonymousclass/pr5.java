
class Parent {
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent {
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Demo {
	void fun(Parent obj) {
		obj.marry();
	}
	void fun(Child obj){
		obj.marry();
	}
}
class Outer {
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun(new Parent());
		obj.fun(new Child());
	}
}
