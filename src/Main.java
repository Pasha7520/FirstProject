import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int a , b ;
		
		Scanner scn = new Scanner(System.in); //��������� ������� ��� ���������� ����� � ������ (��� ������)
		
		
		System.out.println("����� �: ");
		a=scn.nextInt(); //���������� ������ ����� � � ���������
		
		System.out.println("����� �: ");
		b=scn.nextInt(); //���������� ������ ����� � � ���������
		
		char c = scn.next().charAt(0);
		 switch (c){
		 case '+':
			 System.out.println("���� "+(a+b));
			break;
		 case '-':
			 
			 if((a-b)<0){
				 System.out.println("г����� "+(-(a-b)));				 
			 }else {
				 System.out.println("г����� "+ (a-b));
			 }
			break;
		 case '*':
			 System.out.println("������� "+a*b);
			break;
		 case '/':
			 System.out.println("������ "+a/b);
			break;
		 case'%':
			 System.out.println("������ "+(a%b));
		 	break;
		 case'^':
			 System.out.println("ϳ�������� �� �������� :\nA = "+ (a*a)+"\nB = "+ (b*b));
		 break;
		 case'&': 
			 int sum=a;;
		 
			 for(int i=1;i<b;i++){
				 sum=sum*a;
				
			 }
			 
			 System.out.println("ϳ�������� �� ������� "+ sum);
			 break;
			 
		default : 
			System.out.println("����� �� ��� �����");
		 }
		
		
		/*int aa[] = new int[5];
		
		System.out.println(aa[3]);
		
		
		for(int i=0;i<5;i++){
			aa[i]=scn.nextInt();
		}
	
		for(int i=0;i<5;i++){
		System.out.println(aa[i]);
		}*/
		
		
	}
}

