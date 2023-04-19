package javaprograms;

class pune{
	
	int a;
	String name;
	int b;
	
	pune(){
		
	}
	
	pune(int a, String name){
		
		this.a =a;
		this.name =name;
		
	}
	
	pune(int a, String name, int b){
		
		this.a =a;
		this.name =name;
		this.b =b;
	}
	
	void m1() {
		
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		pune e=new pune();
		e.m1();
		pune t=new pune(10, "name");
		t.m1();
		pune s=new pune(30, "fame", 40);
		s.m1();
	}
}		