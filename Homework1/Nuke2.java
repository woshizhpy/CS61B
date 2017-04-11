import java.io.*;

class SimpleIO {
	public static void main(String arg[]) throws Exception {
		System.out.println("Please input a string:");
		BufferedReader keybd= new BufferedReader(new InputStreamReader(System.in));
		String s=new String(keybd.readLine());
		String s2=s.substring(0,1)+s.substring(2);
		System.out.println(s2);
	}
}