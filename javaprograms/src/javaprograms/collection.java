/*
package javaprograms;

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
{	int sid;
String sname;
Student(int sid,String sname)
{	this.sid=sid; this.sname = sname;
}
}
class collection
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111,"ratan"); 
		Student s1 = new Student(222,"xxx"); 
		ArrayList al = new ArrayList(); 
		al.add(10);	
		al.add('a');
		al.add(e1);	//toString()
		al.add(s1);	//toString()
		System.out.println(al);	    //[10, a, javaprograms.Emp@4617c264, javaprograms.Student@36baf30c]
		System.out.println(al.toString());	//[10, a, javaprograms.Emp@4617c264, javaprograms.Student@36baf30c]

	}
}                          
*/
/*
package javaprograms;
import java.util.*;
class Emp
{	
int eid;
String ename;
Emp(int eid,String ename)
{	
	this.eid=eid; 
	this.ename=ename;
}
}
class Student
{	
int sid;
String sname;
Student(int sid,String sname)
{	
	this.sid=sid; 
	this.sname = sname;
}
}

public class collection
{
	public static void main(String[] args) 
	{	
		Emp e1 = new Emp(111,"ratan"); 
		Student s1 = new Student(222,"xxx"); 
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add('a'); 
		al.add(e1);
		al.add(s1);
		System.out.println(al);	
		
		for (Object o : al)                  
		{	
			if (o instanceof Integer) 
			System.out.println(o); 
			if (o instanceof Character) 
			System.out.println(o); 
			if (o instanceof Emp)
			{
			Emp e = (Emp)o;                      // yahan isko nhi pata ki emp integer h ya string isliye   
			{                                                                 // If ke neeche ye sb likha h//
			System.out.println(e.eid+"---"+e.ename);
			}
			if (o instanceof Student)
			{
				Student s = (Student)o; 
				System.out.println(s.sid+"---"+s.sname);
			}
            }
	
		}
	}                                                    
}
*/

/*
package javaprograms;
import java.util.*;
class collection
{
	public static void main(String[] args) 
{	
		Integer i=new Integer(10);	
ArrayList al =new ArrayList(); 
al.add(10);
al.add("aman");
al.add("deep");
al.add('a'); 
al.add(i);
al.add(null);
al.add("A2");

System.out.println("ArrayList data="+al); 
System.out.println("ArrayList size-->"+al.size()); 
al.add(1,"A1");	        //add the object at first index
System.out.println("after adding objects ArrayList size-->"+al.size()); 
System.out.println("ArrayList Data="+al);
al.remove(i);	 //remove the object index base  // ye phle 0 index no. wale ko remove karega.// 
                 //if we write function as al.remove(10);  yahan 10 as index number treat hoga.

al.remove("A2");	      //remove the object on object base 
System.out.println("after removeing elemetns arrayList size "+al.size()); 
System.out.println("ArrayList data="+al); 

System.out.println(al.isEmpty());      // if empty(object) it returns true if not empty it returns false
al.clear(); 
System.out.println("ArrayList data="+al); 
System.out.println(al.isEmpty());  
}
}                                                                  
*/

/*
package javaprograms;
import java.util.*;
class Emp{
int eid;
	String ename;
	
	Emp(int eid, String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
}

class collection
{	
	public static void main(String[] args)
{	
		ArrayList<Emp> al = new ArrayList<Emp>();
			al.add(new Emp(111,"amandeep"));
			al.add(new Emp(222,"Aditya"));
			al.add(new Emp(333,"Gourav"));
			al.add(new Emp(444,"Vikas"));
	for (Emp e : al)
	{	
	System.out.println(e.eid+"---"+e.ename);
	}
}
}                                              */


/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
{	
ArrayList<String> a1 = new ArrayList<String>(); 
a1.add("Amandeep");
a1.add("Gagandeep");
a1.add("Harmanpreet");
a1.add("Mukesh");
ArrayList<String> a4 = new ArrayList<String>(a1);
System.out.println(a4);	
ArrayList<String> a2 = new ArrayList<String>(a1.subList(1,3)); 
System.out.println(a2);	
ArrayList<String> a3 = new ArrayList<String>(a1.subList(1,a1.size())); 
System.out.println(a3);	

}
}                                         */
                                             


/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
{	
ArrayList<String> a1 = new ArrayList<String>(); 
a1.add("Amandeep");
a1.add("Gagandeep");
a1.add("Harmanpreet");
a1.add("Mukesh");
System.out.println("before swapping="+a1);
Collections.swap(a1,1,3);
System.out.println("after swapping="+a1);  
}
}                                                       */


/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
{
	ArrayList<String> al = new ArrayList<String>(Arrays.asList("Aman","Deep","Sandeep")); 
	       	System.out.println(al);
}
}                                                 */



/*
package javaprograms;
import java.util.*;
class collection
{	
public static void main(String[] args)
{
	ArrayList<String> al = new ArrayList<String>(); 
	String[] strArray={"ratan","anu","Sravya"};   
	Collections.addAll(al,strArray);             // to add objects in array list we use this function //
	System.out.println(al);
}
}                                                          
*/



/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al =new ArrayList<String>(); 
		al.add("Amandeep");
		al.add("AAA");
		al.add("BBB");
		System.out.println(al);
		//1st approach to print Collection data
		for (String a : al )
		{	
			System.out.println(a);
		}
		//2nd approach to print Collection data
		
		for (int i=0; i<al.size(); i++)            // here i is treated as index //
		{	System.out.println(al.get(i));
		}

		//3rd approach to print Collection data
		//normal version of Iterator(type casting required at the time of retrieving)
		Iterator itr1 = al.iterator(); 
		while (itr1.hasNext())
		{	
		String str =(String)itr1.next(); 
		System.out.println(str);
		}
		
		//generic version of Iterator(type casting not required at the time of retrieving)
				Iterator<String> itr2 = al.iterator();
				while (itr2.hasNext())
				{	
					String str =itr2.next(); 
				    System.out.println(str);
				}
}
}                                                            
*/


/*
	package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("AAAA");
		al.add("DDDD");
		al.add("CCCC");
		al.add("BBB");
		//printing ArrayList data 
		System.out.println("ArrayList data before sorting"); 
		System.out.println(al);
		
		//sorting ArrayList in ascending order
		Collections.sort(al);
		System.out.println("After sorting ascending order"); 
		System.out.println(al);
	}
}                                                  */





/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("AAAA");
		al.add("DDDD");
		al.add("CCCC");
		al.add("BBB");
		//printing ArrayList data 
		System.out.println("ArrayList data before sorting"); 
		System.out.println(al);
		
		//sorting ArrayList in descending order 
		Collections.sort(al,Collections.reverseOrder()); 
		System.out.println("After sorting descending order"); 
		System.out.println(al);
	}
}         

*/

/*
package javaprograms;
import java.util.*;
class collection
{	public static void main(String[] args)
	{	
		LinkedList<String> l=new LinkedList<String>(); 
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.addLast("Z");	     //it add object in last position 
		l.addFirst("A");	    //it add object in first position 
		l.add(1,"A1");        //add the Object specified index 
		System.out.println("original content:-"+l); 
		l.removeFirst();		//remove first Object 
		l.removeLast();		//remove last Object 
		System.out.println("after deletion first & last:-"+l); 
		l.remove("E");		//remove specified Object
		l.remove(2);	     //remove the object of specified index
		System.out.println("after deletion :-"+l);//A1 B D
		String val = l.get(0); //get method used to get the element 
		l.set(2,val); //set method used to replacement   // means we replace the value of index 2 which is ("D") by the value of val which is("A1")
		System.out.println("after setting:-"+l);                          
 	}  
}
*/
/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("AAA");
		al.add("BBB");

		LinkedList<String> linked = new LinkedList<String>(al); 
		linked.add("anu");
		linked.add("simran"); 
		System.out.println(linked);

 	}
}
*/

/*
package javaprograms;
import java.util.*;
class collection
{	
	public static void main(String[] args)
	{	
		//Constructor 1
		Vector v = new Vector(); 
		System.out.println(v.capacity());     // default capacity =10 //
		v.add("ratan");        // here we add only one element hence capacity remains same but size increases //
		System.out.println(v.capacity());      // if we add more than 10 elements then capacity is double that is 20 //
		System.out.println(v.size());	          // size = number of elements we add //
		
		//Constructor 2
		// Vector v = new Vector(int initial-capacity);
		Vector<String> vv = new Vector<String>(3); 
		System.out.println(vv.capacity());	//3 
		vv.add("aaa");
		vv.add("bbb");
		vv.add("ccc");               
		vv.add("ddd");            
		System.out.println(vv.capacity());	//6     // because we add more than 3 elements hence capacity is double //  
		System.out.println(vv.size());	//4             

		//Constructor 3
		//Vector v = new Vector(int initial-capacity, int increment-capacity);
		Vector<String> v3 = new Vector<String>(2,5); 
		System.out.println(v3.capacity());	//2 
		v3.add("ratan");
		v3.add("aruna");
		v3.add("Sravya"); 
		System.out.println(v3.capacity());	//7        // because we add more than 2 elements hence capacity is incremented by 5 //
		System.out.println(v3.size());	//3
		
		//Constructor 4 adding one collection to another		
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
*/
/*
package javaprograms;
import java.util.*; 
class collection
{	public static void main(String[] args)
{
	String[] str={"Rakesh","Ashish","Sahil"};
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(str)); 
	al.add("newdata-1");
	al.add("newdata-2");
	System.out.println(al);
	//printing data by using for-each loop
	for (String s: al)
	{	System.out.println(s);
	}
}
}
*/
/*
package javaprograms;
import java.util.*; 
class collection
{	public static void main(String[] args)
{
	//interface ref-var & implementaiton class Object
	List<String> al = new ArrayList<String>(); 
	al.add("anu");
	al.add("Sravya");
	al.add("ratan");
	al.add("natraj");
	String[] a = new String[al.size()]; 
	al.toArray(a);    // array list ki values String array mein transfer hogi isse
	//for-each loop to print the data
	for (String s:a)
	{System.out.println(s);
	}
}
}
*/
/*
package javaprograms;
import java.util.*; 
class collection
{	public static void main(String[] args)
{
	//interface ref-var & implementaiton class Object
	List<String> al = new ArrayList<String>(); 
	al.add("anu");
	al.add("Sravya");
	al.add("ratan");
	al.add("natraj");
	Object[] o=al.toArray();
	//for-each loop to print the data
	for (Object oo:o)
	{System.out.println(oo);
	}
}
}
*/
/*
package javaprograms;
import java.util.*; 
class collection
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al =new ArrayList<String>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		ListIterator<String> lstr = al.listIterator(); 
		lstr.add("DDD");                                   
		while(lstr.hasNext())
		{	
			String str =lstr.next(); 
		    System.out.println(str);
		}
}
}
*/
/*
package javaprograms;
import java.util.*; 
class collection
{	
	public static void main(String[] args)
	{	
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("raman");
		al.add("aman");
		al.add("sunny"); 
		Collections.sort(al);
		System.out.println("ArrayList data after sorting");
		 for (String str1 :al)
		{	
		System.out.println(str1);
		}     
	}
}
*/

/*
package javaprograms;
import java.util.*;
public class  collection
{
public static void main(String[] args) 
{	
ArrayList al =new ArrayList(); 
al.add(10);
al.add("aman");
al.add("deep");
al.add('a'); 
al.add("A");
al.add(null);
System.out.println("ArrayList data="+al);                                                                       //     isse  pura  data execute hota h
System.out.println("ArrayList size-->"+al.size()); 
al.add(1,"A1");	//add the object at first index
System.out.println("after adding objects ArrayList size-->"+al.size()); 
System.out.println("ArrayList Data="+al);
al.remove(1);	                        //remove the object index base 
al.remove("A");	//remove the object on object base     //   but only string pr apply hoga  ye …..integer  and  character  ko  index  value   se hi  remove  krna  pdega     ya  phir  inka   object   bnakr //  
System.out.println("after removeing elemetns arrayList size "+al.size()); 
System.out.println("ArrayList data="+al); 
System.out.println(al.isEmpty());
al.clear(); 
System.out.println(al.isEmpty());
}
}
*/

