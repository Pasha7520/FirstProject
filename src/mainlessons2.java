import java.util.Scanner;


public class mainlessons2 {

	public static void main(String[] args) {
		String s1,s2; 
		String s3 = ""; 
		Scanner scn = new Scanner(System.in); 

		System.out.println("Go s1"); 
		s1=scn.nextLine(); 
		System.out.println("Go s2"); 
		s2=scn.nextLine(); 

		for(int i=0;i<s1.length()-s2.length(); i++){ 
		if(!(s1.substring(i, i+s2.length()).equals(s2))){ 
		s3=s3+s1.charAt(i); 
		System.out.println(s3);
		}else 
		{ 
		i=i+s2.length()-1; 
		} 
		} 
		s3=s3+s1.substring(s1.length()-s2.length()+1,s1.length()); 
		System.out.println(s3);
}
	}
