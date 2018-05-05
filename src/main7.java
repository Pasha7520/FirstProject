import java.util.Scanner;


public class main7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введи номер білетика ");
		int n = scn.nextInt();
		
		if(n>99999 && n<1000000){
		int a = n/1000;
		int a1 = a%10;
		int ad = a/10;
		int a2 = ad%10;
		int a3 = ad/10;
		int aSUM = (a1+a2+a3);
		int b = n%1000;
		int b1 = b%10;
		int bd = b/10;
		int b2 = bd%10;
		int b3 = bd/10;
		int bSUM = (b1+b2+b3);
		
		
	
		if(aSUM%bSUM==0){
			System.out.println("Щасливий  ");}
			else {
				System.out.println("Нещасливий ");
			}
		}
		
		else {
			System.out.println("нахуй");
		}
	}

}
