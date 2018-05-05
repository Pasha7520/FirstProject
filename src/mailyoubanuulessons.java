import java.util.Scanner;


public class mailyoubanuulessons {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String mail = new String();
		int sobachka = 0;
		int krapka = 0;
		
		System.out.println("Âגוהט לויכ");
		mail = scn.nextLine();
		int bolen = 0;
		for(int i = 0;i<mail.length();i++){
			if(mail.charAt(i)=='@'){
				if(bolen==1){
					System.out.println("podviyna sobachka");
					return;
				}
				
				sobachka = i;
				bolen=bolen+1;
			}
			if(mail.charAt(i)=='.'){
				krapka = i;
			
			
			}
		}
			if(sobachka > 0 && krapka>sobachka+1 && krapka < mail.length()-1  ){
				System.out.println("צו לויכ");
			}
			else{
				System.out.println("Öו םו לויכ");
				
			
		}
		
	}

}
