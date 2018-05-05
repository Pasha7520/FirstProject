import java.util.Scanner;


public class mainbegin {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		while(5>1){
			System.out.println("¬веди число");
			int a = scn.nextInt();
			if(a%2==0){
				System.out.println("„исло парне");
			}
			if(a%2>0){
				System.out.println("„исло не парне");
			}
			System.out.println("’оч попробувати знову а?1-то так 2 -то н≥");
			int b = scn.nextInt();
		if(b>1)break;
	}
	}

}