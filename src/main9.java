import java.util.Scanner;


public class main9 {
	public static void main(String[] args){
		String d = "Drow";
		String p = "Win";
		String l = "Lose";
		Scanner scn = new Scanner(System.in);
		System.out.println("камінь-1,ножиць-2,папір-3");
		int a = scn.nextInt();
		int com = (int) Math.round(Math.random()*8);
		System.out.println(com);
		while (scn.nextInt()<4){
		if(com<3){
			if(a==1){
				System.out.println(d);
			}
			if(a==2){
				System.out.println(l);
				
			}
			if(a==3){
				System.out.println(p);
			}
			if(a==4){
				System.out.println("The end.");
				return;
			}
		}
		if(com<6&&com>2){
			if(a==1){
				System.out.println(p);
			}
			if(a==2){
				System.out.println(d);
			}
			if(a==3){
				System.out.println(l);
			}
			if(a==4){
				System.out.println("The end.");
				return;
			}
		}
		if(com<9&&com>5){
			if(a==1){
				System.out.println(l);
			}
			if(a==2){
				System.out.println(p);
			}
			if(a==3){
				System.out.println(d);
			}
			if(a==4){
				System.out.println("The end.");
				return;
			}
		}
		}
	}
}
