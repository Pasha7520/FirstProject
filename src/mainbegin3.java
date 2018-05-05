import java.util.Scanner;


public class mainbegin3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введи а=") ;
		double a = scn.nextDouble();
		System.out.println("Введи b=");
		double b = scn.nextDouble();
		System.out.println("Введи c=");
		double c = scn.nextDouble();
		double D = b*b-4*a*c;
		System.out.println(D);
		if(D>0){
			double x1=(-(b+Math.sqrt(D))/(2*a));
			double x2=(-(b-Math.sqrt(D))/(2*a));
			System.out.println(""+x1 + x2);
		}
		if(D==0){
			double x3=(-(b/(2*a)));
			System.out.println(x3);
		}
		if(D<0){
			System.out.println("Розвязку немаэ");
		}
	}

}
