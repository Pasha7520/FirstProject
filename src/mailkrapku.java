import java.util.Scanner;


public class mailkrapku {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S1 = new String();
		int a =-1;
		int b =-1;
		System.out.println("¬веди строку");
		S1 = scn.nextLine();
		for(int i = 0; i < S1.length();i++){
			System.out.println("за");
			if(S1.charAt(i)=='.'){
				if(a==-1){
					a=i;
				}
				System.out.println(a);

			b =i;
			System.out.println(b);

			}
		}
		System.out.println(S1.substring(a+1,b));	
		}

}
