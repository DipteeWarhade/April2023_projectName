package accessmodifier;

public class Parent 
{
	private static void method1()
	{
		System.out.println("Private Method 1 from Parent Class");
	}
		static void method2()
	{
		System.out.println("Private Method 2 from Parent Class");
	}
		protected static void method3()
	{
		System.out.println("Private Method 3 from Parent Class");
	}
		public static void method4()
		{
			System.out.println("Private Method 4 from Parent Class");
		}
		protected void method5()                                       //non static method
		{
			System.out.println("Private Method 5from Parent Class");
		}
		public static void main(String[] args) 
		{
			method1();
			method2();
			method3();
			method4();
			
			Parent obj = new Parent();
			obj.method5();
		}
}
