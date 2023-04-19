package javaprograms;

class delhi{
	
	int a;
	void display()
	{
		System.out.println (a);
	}
	// instance block used to initialized the instance variable during object creation.
	{
		a=80;
	}
			
	public static void main(String[] args){
		//nameless approach
		//new delhi().display();
		System.out.println (new delhi().a);
	
	}
	
}
