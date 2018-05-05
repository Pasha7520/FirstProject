import java.util.Scanner;


public class mainlessons3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = new String();
		String str2 = new String();
		String str4 = new String();
		System.out.println("¬веди строку");
		str = scn.nextLine();
		System.out.println("¬веди символ");
		str2 = scn.nextLine();
		if(str2.length()==1){
			int a = 0;
			int b = str2.length();
			for(int i = 0;i<=str.length()-str2.length();i++){
				String str3 = str.substring(i,i+1);
				//String str3 = "" + str.charAt(i);
				a=a+1;
				b=b+1;
				System.out.println(str3 + " + " +str2);
				if(str3.equals(str2)){
					str4 = str4+str3+str3;
				}
				else{
					str4=str4+str3;
				}
			}
			System.out.println(str4);
			
		}else{
			System.out.println("пнх");
		}
	}

}
