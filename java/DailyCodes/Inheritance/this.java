
class Demo {
	int x = 10;
	int y = 20;
	Demo () {
		this(30,40);
		System.out.println("Constructor-1");
	}
	Demo (int x) {
		System.out.println("Constructor-2");
	}
	Demo (int x, int y) {
		System.out.println("Constructor-3");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
	}
}
