import java.util.Scanner;


public class mainhowA {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = new String();
		System.out.println("Введи рядок :");
		S = scn.nextLine();
		int how = 0;
		int b = 0;
		char a ='а';
		char prob = ' ';
		for(int i = 0;i < S.length();i++){
			if(!(S.charAt(i)==prob)){
				if(b > 0)b--;
				while(i<S.length()&&!(S.charAt(i)==prob)){
					
					
					if(i < S.length()){
						
					if(S.charAt(i)==a&&1 > b){
						b++;
						how=how+1;
					}
					}
				i++;}
			}
		}
		System.out.println("Кількість слів які мають букву а = "+how);
	}

}
