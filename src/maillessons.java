import java.util.Scanner;


public class maillessons {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("¬веди строку");
		String str = scn.nextLine();
		System.out.println("¬веди число");
		int a = scn.nextInt();
		int lon =str.length();
		if(lon>a){
		int	r=lon-a;
		str = str.substring(r,r+2);
		System.out.println(str);
		}
		if(lon<a){
		int d=a-lon;
		String str2 = new String();
		str2 = ".";
		for(int i=0;i<d-1;i++){
		str2=str2+".";}
		System.out.println(str2+str);
	}
		
		//System.out.println("¬веди число");
		//int hui = str.length();
		
		//System.out.println(str);
	//	String str = new String();
	//	str.equals(arg0);
	//	str = str.substring(2,6);
	}
	

}
