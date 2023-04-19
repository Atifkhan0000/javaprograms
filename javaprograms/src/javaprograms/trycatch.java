package javaprograms;

class trycatch {
	public static void main(String[] args) {
		System.out.println("program starts");
		try {
			int[] a = { 10, 20, 30 };
			System.out.println(a[3]);
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			
		} catch (ArithmeticException ae) {
			System.out.println("we are getting exception");
		}
		System.out.println("rest of the code");
	}
}