interface Demo {

	void m1(int x, int y);
}


class Outer {

	public static void main(String[] args){

		Demo obj = (int x, int y)->{

			System.out.println("Anonymous Class");
			System.out.println(x+y);

		};

		obj.m1(10,20);
	}
}
