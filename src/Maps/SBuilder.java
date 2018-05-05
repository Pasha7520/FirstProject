package Maps;

import java.util.Scanner;

public class SBuilder {
	public static void main(String[] args){
		StringBuilder b = new StringBuilder("Hello");
		String S ="";
		Scanner scn = new Scanner(System.in);
		while((S=scn.nextLine())!=null){
			b.append(S);
			System.out.println(b.toString());
		}
	}
}
