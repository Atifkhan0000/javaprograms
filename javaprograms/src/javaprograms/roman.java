package javaprograms;

class roman{

void m1(){
	
System.out.println("m1 instance method");	

	
}

void m1(int a, int b) {
	
	System.out.println("m2  method");	
}



public static void main (String[] args) {
	roman t =new roman();
	t.m1(1,1);
}
	
}
