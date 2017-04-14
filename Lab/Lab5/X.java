public class X {
	public int a;
	public int b;
	public static final int c=9;
	public X() {
		a=0;
		b=1;
	}
	public X(int x,int y)
	{
		a=x;
		b=y;
	}
	public X(int x)
	{
		a=x;
		b=1;
	}
	public String toString()
	{
		String s="a="+Integer.toString(a)+", b="+Integer.toString(b);
		return s;
	}
	public void display()
	{
		System.out.println(toString());
	}
	public static void testInheritation(){
		System.out.println("This is in the Super class!");
	}
}
