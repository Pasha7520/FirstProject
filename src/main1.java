import java.util.Scanner;


public class main1 {

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
		 if(b>0){
			 for(int i=1;i<b;i++){
				 sum=sum*a;
				
			 }
			 
			 System.out.println("ϳ�������� �� ������� "+ sum);
			 break;}
		 else if (b<0){
			 for(int i=-1;i>b;i--){
				 sum=sum*a;
			 }System.out.println("ϳ�������� �� ������� "+ -sum);
		 }else {
			 System.out.println("ϳ�������� �� ������� "+ 0);
		 }
		 
		 
		 }
	}

}
