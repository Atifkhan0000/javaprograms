package javaprograms;

class name{
	
	name(){
		
		this(10);
		System.out.println ( "0- arg const");
	}
	
	name(int a){ 
		this (2,3);
		System.out.println ( "1- arg const");
	}
	
	name(int a, int b){ 
		System.out.println ( "2- arg const");
		}
	
	
	
	public static void main (String[] args) {
		
		name t= new name();
}
}