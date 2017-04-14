class Lab5P2 {
	public static void main(String arg[]) throws Exception {
		Y y1=new Y(3,4,5);
		X x1=new X(1,2);
		System.out.println("Display with new parameter type");
		y1.display(23);
		System.out.println("Display with new output type");
		//int m=y1.display();
		System.out.println("Display as original in X");
		y1.display();
		// for part 3
		System.out.println(Integer.toString(((X)y1).c)); //compile time error
		((X)y1).display();
		X x2=new Y(56,78);
		x2.display();
		//((Y)x1).display(); // Run-time error
		((X)y1).testInheritation();
		y1.testInheritation();

		
		
	}
}