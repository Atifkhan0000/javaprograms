package javaprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


                           // try and catch //

/*

class practice {
	
	static void m1(int n,String s){
		try {
			System.out.println(10 / n);
			String str = s;
			System.out.println("u r name is :" + str);
			System.out.println("u r name length is--->" + str.length());
		} catch (Exception e) {
			System.out.println("geting Exception: " + e);
		} 
		System.out.println("rest of the code");
	}
		
	public static void main(String[] args) {
		
		practice.m1(3, null);
	}
}             

*/



/*

class practice {
	
	static void m1(int n,String s){
		String str = s;
		try {
			System.out.println(10 / n);
			
			System.out.println("u r name is :" + str);
			//System.out.println("u r name length is--->" + str.length());
		} catch (ArithmeticException e) {
			System.out.println("geting Exception: " + e);
			System.out.println("u r name length is--->" + str.length());
		}
		catch (Exception e) {
			
		} 
		System.out.println("rest of the code");
	}
		
	public static void main(String[] args) {
		
		 practice.m1(0, null);         
	}
}

*/

/*
class practice {
	public static void main(String[] args) {
		try {
			System.out.println("statement 1");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("u r getting ae:" + ae);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}
}
*/

/*
class practice {
	public static void main(String[] args) {
		try {
			System.out.println("statement 1");
			System.out.println(10 / 0);
		} catch (NullPointerException ae) {
			System.out.println("u r getting ae:" + ae);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}
}

*/

/*

class practice {
	public static void main(String[] args) {
		System.out.println("program starts");
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			int a = 10 / 5;
			System.out.println(a);
		}
		System.out.println("rest of the code ");
	}
}

*/


                                         // File handling IO.java //

/*
class practice  {
	
	public static void main(String[] args) throws IOException  {
		
		File f=new File ("mytestfile.txt");
		
	    System.out.println(f.exists());
		
	    boolean b=f.createNewFile();
	     if (b) {
	    	 System.out.println("file is created.." + f.getPath());
	     }
	     else {
	    	 System.out.println("file already exist.");
	     }
	    System.out.println(f.exists());
	
		
		
	}
}
*/
/*
class practice  {
	
	
	public static void main(String[] args) throws IOException  {
		
		File f=new File ("achiver");
		
		System.out.println(f.exists());
		
		boolean b=f.mkdir();                 // mkdir means make directory //
	     if (b) {
	    	 System.out.println("directory is created.." + f.getPath());
	     }
	     else {
	    	 System.out.println("directory already exist.");
	     }
	    System.out.println(f.exists());
	
		
		
	}
} 
*/
/*
class practice {
	
public static void main(String[] args) throws IOException  {
	
	File f=new File ("C:\\Users\\Compaq\\Documents","csvfile.txt");
	
	System.out.println(f.exists());
	
	boolean b=f.createNewFile(); 
     if (b) {
    	 System.out.println("file is created.." + f.getPath());
     }
     else {
    	 System.out.println("file already exist.");
     }
    System.out.println(f.exists());
    
}
}
*/
/*
class practice {
	
public static void main(String[] args) throws IOException  {
	
	File f=new File ("C:\\Users\\Compaq\\Documents","mytestfile.txt");
	
	System.out.println(f.exists());
	
	boolean b=f.createNewFile(); 
     if (b) {
    	 System.out.println("file is created.." + f.getPath());
     }
     else {
    	 System.out.println("file already exist.");
     }
    System.out.println(f.exists());
    
}


}
*/

/*
class practice { 
	
	public static void main (String[] args){
				
		practice t=new practice();	
		// length()
		String s1="sanjeev";
		System.out.println(s1.length()); // 7
		
		System.out.println(s1.charAt(2)); // n
		
		System.out.println(s1.indexOf("j")); // 3
		
		System.out.println(s1.startsWith("sa")); // true
		
		System.out.println(s1.startsWith("asa")); // false
		
		System.out.println(s1.endsWith("v")); //true
		
		System.out.println(s1.endsWith("iv")); //false
		
		System.out.println(s1.getClass()); // class java.lang.String
		
		System.out.println(t.getClass()); // class javaprograms.practice
		
		System.out.println(s1.substring(0,4));  // sanj
		
		System.out.println(s1.replace("san", "ra")); //rajeev
		
		System.out.println(s1.toUpperCase()); //SANJEEV
		
			
	}
}

*/

/*
class practice{
	
	public static void main(String[] args){
		int[] i=new int[2]; 
		
		System.out.println(i);
		System.out.println(i.getClass().getName());
	}
}
*/

/*
 
interface it1    // by default abstract
{ 
 int a=10; // public static final;
 };
interface it2    // by default abstract
{ 
 int a=100; // public static final;
 } 
class practice implements it1,it2{
		public static void main (String[] args){
			System.out.println(it1.a);
			System.out.println(it2.a);
					}
}
*/

/*

class practice {
	public static void main(String[] args) throws IOException  {

		//File f = new File("inputfile.txt");
		FileWriter fos = new FileWriter("inputfile.txt");     
		                                                                      
		fos.write("writing a string");                                  
		fos.write('\n');
		
		char[] c= {'a','b','c','d'};
		
		fos.write(c);
		fos.write('\n');
		
		fos.write(100);
		fos.write('\n');
		
		fos.flush();
		fos.close();

	}

}
*/

/*
class practice {
	public static void main(String[] args) throws IOException {

		
		File f=new File("inputfile.txt");
		FileReader fr = new FileReader(f);
		
		
		char[] c=new char[(int)f.length()];
		int a=fr.read(c);
		
		System.out.println(a);
		
		for (char c1 : c) {
			System.out.print(c1);
		}
		fr.close();
		// fw.close();

	}

}
*/

/*
class practice {
public static void main(String[] args) throws IOException {

	FileReader fr = new FileReader("inputfile.txt");
	 FileWriter fw = new FileWriter("outputfile.txt");

	int a;

	while ((a = fr.read()) != -1) {
		System.out.print((char) a);
		 fw.write(a);
	}

	fr.close();
	 fw.close();

}
}
*/
/*
class practice {
	
	public static void main(String[] args){
		
		int [] x={1,20,3,44};   // value koi bhi le lo bus integer honi chahiye ye matlab h homogeneous ka //
		
		// 1-way
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
	}
	}
*/