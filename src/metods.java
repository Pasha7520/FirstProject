import java.util.Scanner;


public class metods {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scn = new Scanner(System.in);
		a =scn.nextInt();
		b =scn.nextInt();
		c = gChlen(a,b);
		System.out.println(c);
	}
	
	
	public static int gChlen(int a,int b){
		int c = a + b;
		return c;
	}
}
