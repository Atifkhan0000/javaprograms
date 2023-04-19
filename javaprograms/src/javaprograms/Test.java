package javaprograms;

class Test{
	static int x=10;  //static variable
	int g=10;        //instance variable
	double y;        //instance variable
	boolean b;       //instance variable
	String s;       //instance variable
	
	void m1() {
		
		int x=10;       // x= local variable
	}
	
	public static void main (String[] args) {
		
		Test t=new Test();
		
		Test a=new Test();
		
		System.out.println(t.g); //10    using object
		System.out.println(a.g); //10
		
		t.g=20;
		System.out.println(t.g); //20
		System.out.println(a.g); //10
		
       //--------------------------------
		
		System.out.println(t.x); //10    directly/using object/using class name
		System.out.println(a.x); //10
		
		t.x=20;
		System.out.println(t.x); //20
		System.out.println(a.x); //20
		
	}
		
	}


