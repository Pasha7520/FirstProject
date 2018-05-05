import java.util.Scanner;


public class mainAAAword {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = new String();
		System.out.println("¬веди текст");
		S = scn.nextLine();
		char prob = ' ';
		char a = 'а';
		int how = 0;
		int b = 0;
		
		for(int i = 0; i < S.length();i++){
			if(!(S.charAt(i)==prob)){
				b=0;
				while(i < S.length()&&!(S.charAt(i)==prob)){
					if(a==S.charAt(i)){
						b++;
						if(b==3){
							how++;
							b=0;
						}
						
					}
				i++;}
			}
		}
		System.out.println("к≥льк≥сть сл≥в €к≥ м≥ст€ть три буви а = "+how);
	}

}
