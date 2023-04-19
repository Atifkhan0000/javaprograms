package javaprograms;

/*
import java.util.*; 
 class maping
{	
	public static void main(String[] args)
	
	{	Hashtable<String,String> h = new Hashtable<String,String>();
		//adding data in HashTable
		h.put("1","one");
		h.put("2","two");
		System.out.println(h); 
		System.out.println(h.get("1")); //one 
		System.out.println(h.isEmpty()); 
		h.remove("2"); 
		System.out.println(h); 
		System.out.println(h.containsKey("1")); 
		System.out.println(h.containsKey("3"));
		System.out.println(h.containsValue("one")); 
		System.out.println(h.size());
		//to get all values objects 
		Collection<String> c = h.values(); 
		for (String i : c)
		{System.out.println(i);  }
		//to get all key objects 
		Set<String> s = h.keySet(); 
		for (String ss : s) {  System.out.println(ss);  }
}
	}   */


/*
import java.util.*; 
class maping
{	public static void main(String[] args)
	{	HashMap h = new HashMap(); 
		h.put(111,"Amandeep");
		h.put(222,"Aditya");
		h.put(333,"Vikas");
		System.out.println(h);
		//keySet() to get all keys.
		Set s1=h.keySet(); 
		System.out.println("all keys:--->"+s1);
		//values() to get all the values. 
		Collection c = h.values(); 
		System.out.println("all values--->"+c);
		//entrySet() to get all the entries.
		Set ss = h.entrySet(); 
		System.out.println("all entries--->"+ss); 
			Iterator itr = ss.iterator();
		while (itr.hasNext())
		{	Map.Entry m= (Map.Entry)itr.next(); 
			System.out.println(m.getKey()+"	"+m.getValue());
		}	}}
*/
		
//OR

/*
import java.util.*; 
class maping
{	public static void main(String[] args)
	{	HashMap h = new HashMap(); 
		h.put(111,"Amandeep");
		h.put(222,"Aditya");
		h.put(333,"Vikas");
		//keySet() to get all keys.
		System.out.println("all keys:--->"+h.keySet());
		//values() to get all the values. 
		System.out.println("all values--->"+h.values());
		//entrySet() to get all the entries.
		System.out.println("all entries--->"+h.entrySet()); 
		 Set s=h.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext())
		{	Map.Entry m= (Map.Entry)itr.next(); 
			System.out.println(m.getKey()+"	"+m.getValue());
		}	
			
}}
*/

/*
import java.util.*; 

class Emp
{	
int eid;
String ename;
Emp(int eid,String ename)
{
	this.eid=eid; this.ename=ename;
}
}

class Student
{	//instance variables
int sid;
String sname;
Student(int sid,String sname)//local variables
{
	this.sname=sname; this.sid=sid;
}
}


class maping
{	
	public static void main(String[] args)
	{
		Emp e1=new Emp(333, "AAA");
		Student s10=new Student(555, "BBB");

		LinkedHashMap<Emp,Student> h = new LinkedHashMap<Emp,Student>(); 

		h.put(new Emp(111,"Aman"), new Student(1,"deep"));
		h.put(new Emp(222,"Rohan"), new Student(2,"abhishek")); 
		h.put(e1,s10);
		Set s = h.entrySet();
		System.out.println("all entries--->"+s);
		Iterator itr = s.iterator(); 
		while (itr.hasNext())

		{		
		Map.Entry m = (Map.Entry)itr.next(); 

		Emp e = (Emp)m.getKey();    // kyuki h object ke liye new Emp(111,"Aman") key and new Student(1,"deep") value h 
                                      // isliye emp ke sath getkey and student ke sath getvalue use liya h
		System.out.println(e.ename+"--"+e.eid);   //new Emp(111,"Aman") ke andar ka eid ename le rhe hain yha pr

		Student ss = (Student)m.getValue(); 

		System.out.println(ss.sname+"--"+ss.sid);   //new Student(1,"deep") ke andar ka sid sname le rhe hain yha pr
		}		
}
}
*/

/*
import java.util.*; 

class maping
{	
	public static void main(String[] args)
	{
	Map<Integer,String> h1 = new LinkedHashMap<Integer,String>();  
	h1.put(111,"AAA");
	h1.put(222,"BBB");

	Map<Integer,String> h2 = new LinkedHashMap<Integer,String>(h1); 
	h2.put(333,"CCC");
	
	System.out.println(h2);   // to print normally
	
	for (Map.Entry m : h2.entrySet())    // to print from for each loop
	{	
		System.out.println(m.getKey()+"---"+m.getValue());
	}
	
}
}


/*
import java.util.*; 

class maping
{	
	public static void main(String[] args)
	{
		Hashtable<String,String> h = new Hashtable<String,String>();
		//adding data in HashTable
		h.put("1","one");
		h.put("2","two");
		h.put("3","three"); 
		h.put("3","five"); 
				
		System.out.println(h); 
		System.out.println(h.get("1")); //one 
		System.out.println(h.isEmpty()); 
		h.remove("2"); 
		System.out.println(h); 
		System.out.println(h.containsKey("1")); 
		System.out.println(h.containsKey("3"));
		System.out.println(h.containsValue("one")); 
		System.out.println(h.size());
		//to get all values objects 
		
		Collection<String> c = h.values(); 
		for (String i : c)
		{	
			System.out.println(i);
		}

 
		//to get all key objects 
		Set<String> s = h.keySet(); 
		for (String ss : s)
		{	
			System.out.println(ss);
		}
}
}
*/
/*
import java.util.*; 

class maping
{	
	public static void main(String[] args)
	{
		HashMap h = new HashMap(); 
		h.put(111,"Amandeep");
		h.put(222,"Aditya");
		h.put(333,"Vikas");
		h.put(444,"Vishal");
		h.put(888,"Gaurav");
		h.put(666,"Mohit");
		h.put(221,"Atif");
		h.put(777,"Kuldeep");
		h.put(999,"Sahil");
		h.put(777,"Gagandeep");
		h.put(000,"Harpreet");
		h.put(1234,"Suneel");

		
		//keySet() to get all keys.
		Set s1=h.keySet(); 
		System.out.println("all keys:--->"+s1);
			
		//values() to get all the values. 
		Collection c = h.values(); 
		System.out.println("all values--->"+c);
		
		//entrySet() to get all the entries.
		Set ss = h.entrySet(); 
		System.out.println("all entries--->"+ss); 
		
		Iterator itr = ss.iterator();
		while (itr.hasNext())
		{		
			Map.Entry m= (Map.Entry)itr.next(); 
			System.out.println(m.getKey()+"	"+m.getValue());
		}
			
		
		}
}
*/
/*
import java.util.*; 

class maping
{	
	public static void main(String[] args)
	{
		TreeMap h = new TreeMap(); 
		h.put(999,"MMM");               
		h.put(222,"AAA");
		h.put(333,"KKK");
		h.put(444,"ZZZ");
		h.put(111,"BBB"); 
		h.put(666,"QQQ"); 
		h.put(555,"SSS"); 
		System.out.println(h);               // Tree map gives the output in ascending order of keys//

		Map m = h.subMap(222,444); 
		System.out.println(m);

		System.out.println(h.firstEntry()); 
		System.out.println(h.lastEntry()); 
		System.out.println(h.firstKey()); 
		System.out.println(h.lastKey()); 
		System.out.println(h.lowerKey(222)); 
		System.out.println(h.higherKey(222));

		SortedMap s1 = h.headMap(333);           

		TreeMap t1 = new TreeMap(s1); 
		System.out.println(t1);             //System.out.println(s1);   also gives the same answer

		SortedMap s2 = h.tailMap(333); 
		TreeMap t2 = new TreeMap(s2);

		System.out.println(t2);             //System.out.println(s2);   also gives the same answer

}
}
*/
                             //OR
/*
import java.util.*; 

class maping
{	
	public static void main(String[] args)
	{
		TreeMap h = new TreeMap(); 
		h.put(1,"MMM");               
		h.put(22,"AAAA");
		h.put(333,"KKKa");
		h.put(44,"ZZZjh");
		h.put(11,"BBB"); 
		h.put(666,"QQQk"); 
		h.put(555,"SSS"); 
		System.out.println(h);               // Tree map gives the output in ascending order of keys//

		Map m = h.subMap(22,44); 
		System.out.println(m);

		System.out.println(h.firstEntry()); 
		System.out.println(h.lastEntry()); 
		System.out.println(h.firstKey()); 
		System.out.println(h.lastKey()); 
		System.out.println(h.lowerKey(22)); 
		System.out.println(h.higherKey(22));

		SortedMap s1 = h.headMap(333);           

		TreeMap t1 = new TreeMap(s1); 
		System.out.println(t1);             //System.out.println(s1);   also gives the same answer

		SortedMap s2 = h.tailMap(333); 
		TreeMap t2 = new TreeMap(s2);

		System.out.println(t2);             //System.out.println(s2);   also gives the same answer

}
}
*/
