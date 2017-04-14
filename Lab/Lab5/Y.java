
public class Y extends X implements Inf{
	public int yc;
	public Y() {
		super();
		yc=2;
	}
	public Y(int m,int n,int l){
		super(m,n);
		yc=l;
	}
	public Y(int m,int n){
		super(m,n);
		yc=2;
	}
	public String toString()
	{
		String s1=super.toString();
		String s2=s1+", yc="+Integer.toString(yc);
		return s2;
	}
	public void display()
	{
		System.out.println(toString());
	}
	//public int display() //compile error
	//{
	//	System.out.println(toString()+"return int");
	//}
	public void display(int a)
	{
		System.out.println(toString()+" input int"+Integer.toString(a));
	}
	public void showY()
	{
		System.out.println("This is Y");
		System.out.println(toString());
	}
	public static void testInheritation(){
		System.out.println("This is in Subclass!");
	}
}