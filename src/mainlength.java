import java.util.Scanner;


public class mainlength {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S = new String();
		System.out.println("¬веди текст: ");
		//S = scn.nextLine();
		String word = new String();
		String probil = new String();
		probil = "";
		word = "";
		int r =1/2;
		System.out.println(r);
		String O = new String();
		String Obrez = new String();
		char prob = ' ';
		 for(int i = 0; i < S.length();i++){
			while(S.charAt(i)==prob){
				probil=" ";
				i++;
			}
				 while(i < S.length()&&!(S.charAt(i)==prob)){
					 word=word+S.charAt(i);
					 i++;
					 
				 }
			Obrez=Obrez + probil + word;
			probil=" ";
			word="";
			
		 }
		 System.out.println(Obrez);
	}

}
