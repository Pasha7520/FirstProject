import java.util.Scanner;


public class main8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("����� ������ ");
		int n = scn.nextInt();double grn=0,usd=0,eur=0,pln=0,rub=0;
		if(n==1){
			System.out.println("����� ���� �������! ");
			grn = scn.nextInt();
			usd = grn/25.4886;
			eur = grn/28.47;
			pln = grn/6.573;
			rub = grn*2.5533;
			System.out.println("������ = "+grn+">>>>"+" ������ = "+usd+" ���� = "+eur+" ��������� ������ = "+pln+" ��������� �����= "+rub);

		}
		if(n==2){
			System.out.println("����� ���� �������! ");
			usd = scn.nextInt();
			grn = usd*25.4886;
			eur = grn/28.47;
			pln = grn/6.573;
			rub = grn*2.5533;
			System.out.println(" ������ = "+usd+">>>>"+"������ = "+grn+" ���� = "+eur+" ��������� ������ = "+pln+" ��������� �����= "+rub);
			
		}
		if(n==3){
			System.out.println("����� ���� ����! ");
			eur = scn.nextInt();
			grn = eur*28.47;
			usd = grn/25.4886;
			pln = grn/6.573;
			rub = grn*2.5533;
			System.out.println(" ���� = "+eur+">>>>"+" ������ = "+usd+ "������ = "+grn+" ��������� ������ = "+pln+" ��������� �����= "+rub);

		}
		if(n==4){
			System.out.println("����� ���� ��������� ������ =");
			pln = scn.nextInt();
			grn = pln*6.573;
			usd = grn/25.4886;
			eur = grn/28.47;
			rub = grn*2.5533;
			System.out.println(" ��������� ������ = "+pln+">>>>"+" ��������� �����= "+rub+" ���� = "+eur+" ������ = "+usd+ " ������ = "+grn);

		}
		if(n==5){
			System.out.println("����� ���� ��������� ����� =");
			rub = scn.nextInt();
			grn = rub/2.5533;
			usd = grn/25.4886;
			eur = grn/28.47;
			pln = grn/6.573;
			System.out.println(" ��������� �����= "+rub+">>>>"+" ��������� ������ = "+pln+" ���� = "+eur+" ������ = "+usd+ " ������ = "+grn);
			
		}
		if(n>5){ 
			System.out.println("���� ���� ������ � ���������");
			
		}
	}

}
