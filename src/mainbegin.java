import java.util.Scanner;


public class mainbegin {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		while(5>1){
			System.out.println("����� �����");
			int a = scn.nextInt();
			if(a%2==0){
				System.out.println("����� �����");
			}
			if(a%2>0){
				System.out.println("����� �� �����");
			}
			System.out.println("��� ����������� ����� �?1-�� ��� 2 -�� �");
			int b = scn.nextInt();
		if(b>1)break;
	}
	}

}