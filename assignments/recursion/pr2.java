class PrintNum{

	void printnumbers(int  num){
	
		if (num <1){
		return;
		}
		System.out.println(num);
		printnumbers(num - 1);
	
	}

	public static  void main (String [] args){

		PrintNum pn = new PrintNum();
		pn.printnumbers(10);
	
	}

}
