package javaprograms;

class X{};
class Y{};
class A{};
class B{};

class aiza{
	
	void m1(X x, Y y) {                             // X is the class type and x is the address
		
			System.out.println("m1 instance method");
	}
	
	static void m2(A a, B b) {                      
		
		System.out.println("m2 static method");
	}
	
	public static void main(String[] args) {
		
		aiza t=new aiza();
		t.m1(new X(), new Y());                      // X x=new X()  ,Y y=new (Y)
		m2(new A(), new B());                        // A a=new A()  ,B b=new (B)
		}
}