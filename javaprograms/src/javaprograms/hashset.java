package javaprograms;

/*
import java.util.*; 
class hashset
{	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<String>(); 
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("D");
		//creation of Iterator Object 
		Iterator<String> itr = h.iterator(); 
		while (itr.hasNext())
		{	
			String str = itr.next(); 
			System.out.println(str);
		}
	}
}
*/

/* 
import java.util.*; 
class hashset
{	public static void main(String[] args)
	{ HashSet<String> h = new HashSet<String>(); 
	h.add("C");
	h.add("D");
	h.add("C");
	h.add(null);
	h.add(null);
	System.out.println(h);
 	} }
*/

/* 
import java.util.*; 
class hashset
{	
	public static void main(String[] args)
	 {
       TreeSet<String> t = new TreeSet<String>();
                   t.add("Shubhdeep");
                   t.add("Amandeep");
	 t.add("Harpreet"); 
	 System.out.println(t);
	 TreeSet<Integer> t1 = new TreeSet<Integer>(); 
	 t1.add(10);
	 t1.add(12);
	 t1.add(8); 
	 System.out.println(t1);
 	}
}
*/

/*
import java.util.*; 
class hashset
{	
	public static void main(String[] args)
	{	
		TreeSet<Integer> t=new TreeSet<Integer>(); 
		t.add(50);
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(30);
        System.out.println(t);//10 20 30 40 50 
		System.out.println(t.headSet(30));//[10,20] 
		System.out.println(t.tailSet(30));//[30,40,50] 
		System.out.println(t.subSet(20,50));//[20,30,40] 
		System.out.println("last element="+t.last());//50 
		System.out.println("first element="+t.first());//10 
		System.out.println("lower element="+t.lower(50));//40 
		System.out.println("higher element="+t.higher(20));//30 
		System.out.println(t.pollFirst());//10 
		System.out.println(t);
		System.out.println("print & remove last element="+t.pollLast());//50
		System.out.println(t);
		System.out.println("final elements="+t);//20 30 40 
		System.out.println("TreeSet size="+t.size());//3 
		System.out.println("final elements="+t);//20 30 40
		

}
}
*/
