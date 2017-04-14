// the definition of X and Y
// Y is extended from X
import java.io.*;
class Lab5P1 {
	public static void main (String arg[]) throws Exception {
		
		X x1=new X(1,2);
		Y y1=new Y(3,4,5);
		x1.display();
		y1.display();
		X[] xa=new X[3];
		Y[] ya=new Y[3];
		xa[0]=x1;
		ya[0]=y1;
		
		xa[0].display();
		
		//ya=(Y[])xa; // Run-time error
		//System.out.println("Done give xa(reference to X array) to ya!)");
		xa=ya;
		ya=(Y[])xa; // Groovy
		ya[0].display();
		ya[0].showY();
		xa=new Y[3];
		xa[0]=y1;
		ya=(Y[])xa;
		ya[0].showY();
		xa=ya;
		//ya[0]=(Y)x1; //Run-time error
		//ya=xa;  //Compile-time error
		
		
		
	}
}