package javaprograms;

class atif{
	
	void m1() {
		
		System.out.println("m1 instance method"); // instance area
	}
		void m2() {
			
			System.out.println("m2 method");      // instance area
	}
 
	public static void main(String[] args) {
		
		atif t=new atif();
		t.m1();                                   // static area
		t.m2();
	}
}

