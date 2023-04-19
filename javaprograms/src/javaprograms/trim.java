package javaprograms;

class trim{
	
	int a;
	String name;
	
	trim(int a, String name){
		this.a=a;
		this.name=name;
	}
	
	void m1() {
		
		System.out.println(a);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		trim t=new trim(10, "bird");
		t.m1();
		new trim(20, "eagle").m1();
		
	}
}