package javaprograms;

import java.util.*; 
class jimo
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("no1");
		al.add("no2");
		
		Vector<String> v5 = new Vector<String>(al); 
		v5.add("ratan");
		v5.add("aruna"); 
		System.out.println(v5);
					 
        ArrayList<String> a2 = new ArrayList<String>(v5); 
        a2.add("xxx");
		a2.add("yyy"); 
		System.out.println(a2);
 	
}
	}