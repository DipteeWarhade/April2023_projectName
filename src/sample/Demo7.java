package sample;

public class Demo7 {

	public static void main(String[] args)
	{
		Demo7 d1 = new Demo7();    //non statc method call with object creation
		d1.show();                   // objectname.methodname();
		d1.show1();
	}
	public void show()
	{
		System.out.println("Non static show method");
	}
	public void show1()
	{
		System.out.println("Non static another show method");
	}

}
