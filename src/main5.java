import java.util.Scanner;


public class main5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("����� ������� �������� ");
		int n = scn.nextInt();
		double [] num = new double [n];
			for(int i = 0;i < num.length;i++){
				System.out.println("���� �������� ������ ");
				num [i] = scn.nextDouble();
			}
		double ser = 0;
			for(int i = 0;i < num.length;i++){
				ser += num[i];
			}
		System.out.println("������� " + ser/n);
	}

}
