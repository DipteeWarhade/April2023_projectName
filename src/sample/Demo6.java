package sample;

public class Demo6 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		}
public static void add(int i , int j)
{
	int add=i+j;
	System.out.println(add);
	}
public static void sub(int i ,int j)
{
	int sub=i-j;
	System.out.println(sub);
	}
public static void mul(int i, int j)
{
	int mul=i*j;
	System.out.println(mul);
	}
public static void div(int i,int j)
{
	int div=j/i;
	System.out.println(div);}

}
