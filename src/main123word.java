import java.util.Scanner;


public class main123word {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String S = new String();
	System.out.println("����� ����� :");
	S = scn.nextLine();
	char prob = ' ';
	int how = 0;
	for(int i = 0;i < S.length();i++){
		if(!(S.charAt(i)==prob)){
			how = how+1;
			System.out.println("�");
			while(i<S.length()&&!(S.charAt(i)==prob)){
				System.out.println("�");
				i++;
			}
			
		}
	}
			System.out.println("ʳ������ ��� � ����� = "+how);
	}

}
