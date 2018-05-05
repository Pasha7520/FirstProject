import java.util.Scanner;


public class mainlesons3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1 = new String();
		String str2 = new String();
		String obrez = new String();
		String endstring = new String();
		System.out.println("¬веди строкує1");
		str1 = scn.nextLine();
		System.out.println("¬веди строкує2");
		str2 = scn.nextLine();
		for(int i = 0;i < str1.length()-str2.length();i++){
			if(str1.substring(i,i+str2.length()).equals(str2)){
				i=i+str2.length();
			}
			
			obrez=obrez+str1.charAt(i);
			System.out.println(obrez);
		}
		obrez = obrez + str1.substring(str1.length()-str2.length(),str1.length());
		System.out.println(obrez);
		}
	
		


	}


