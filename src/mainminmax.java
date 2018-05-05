import java.util.Scanner;


public class mainminmax {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Текст: ");
		String S = new String();
		S = scn.nextLine();
		char prob = ' ';
		int min= 0;
		int max = 0;
		int a = 0;
		int b = 0;
		 for(int i = 0;i < S.length();i++){
			 while(i < S.length()&&!(S.charAt(i)==prob)){
				 a++;
				 
				 i++;
				 
			 }
			 if(b<1)
				 min = a;
				 max = a;
				 b=b+1;
				 
		 
		 if(a<min){
			 min=a;
			 
		 }
		 if(a>min){
			 max=a;
		 }
		 a=0;
		 }
		 System.out.println("min = "+min+ " max = "+max);
	}

}
