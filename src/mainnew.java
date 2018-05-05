import java.util.Scanner;


public class mainnew {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String S1 = new String();
		String S2 = new String();
		String S3 = new String();
		String Obrez = new String();
		int onelong = 0;int a=0;int b=0;
		int twolong = 0;
		System.out.println("Введи строку №1");
		S1 = scn.nextLine();
		System.out.println("Введи строку №2");
		S2 = scn.nextLine();
		System.out.println("Введи строку №3");
		S3 = scn.nextLine();
		int longg = 0;int word = 0;
		if(S2.length()>S3.length()){
		 onelong = S2.length()-S3.length();}
		else
		{ twolong = S3.length()-S2.length();
		
		}
		for(int i = 0;i < S1.length()-S2.length();i++){
			if(!(S1.substring(i,S2.length()+i).equals(S2))){
				System.out.println((S1.substring(i,S2.length()+i)));
			Obrez = Obrez + S1.charAt(i);
			}
			else
			{
			i=i+S2.length()-1;
			Obrez = Obrez + S3;
			word=word+1;
			}
		}
		
		
		if((S1.substring(S1.length()-S2.length(),S1.length()).equals(S2)))
			Obrez = Obrez + S3;
		if(onelong>twolong){
			a=Obrez.length()+(onelong*word);
			Obrez=Obrez+S1.substring(a,S1.length());
		}
		if(onelong<twolong){
			b=Obrez.length()-(twolong*word);
			Obrez=Obrez+S1.substring(b,S1.length());
		}
		if(onelong==twolong){
			Obrez=Obrez+S1.substring(Obrez.length(),S1.length());
		}
		System.out.println(Obrez);
		

		

	}

}
