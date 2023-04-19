package javaprograms;

class door{
	
	int x=100;            // instance variable
	int y=200;            // instance variable
	
	void m1(int x, int y) {                   // local variable
		
		System.out.println(x+y);              // local variable
		System.out.println(this.x+this.y);    // instance variable
		}
	
	public static void main(String[] args) {
		
		door t=new door();
		t.m1(1000,2000);
	}
}

