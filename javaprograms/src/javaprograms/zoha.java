package javaprograms;

 class zoha{
	
	void m1() {
		
		m2();
		System.out.println("m1 method");        // instance area
		m2();
	}
	
	static void m2() {
		
		m3(10);
		System.out.println("m2 method");        // static area
	}
	
	 static void m3(int a) {
		
		 System.out.println("m3 method");        // static area
	}
	
	public static void main(String[] args) {
		
		zoha t=new zoha();                      // static area
		t.m1();
	}
}



