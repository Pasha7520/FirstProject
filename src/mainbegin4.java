import java.util.Scanner;


public class mainbegin4 {
			public static void main(String[]args) {
				Scanner scn = new Scanner(System.in);
				System.out.println("����� ����� ");
				int a = scn.nextInt();
				System.out.println("����� ����� ");
				int b = scn.nextInt();
				char c = scn.next().charAt(0);
					switch (c){
						case '+':
							System.out.println("���� " + (a+b));
							break;
						case '-':
							System.out.println("г����� " + (a-b));
							break;
						case '*':
							System.out.println("������� " + (a*b));
							break;
						case '/':
							System.out.println("������ " + (a/b));
							break;
						case '%':
							System.out.println("������ " + (a%b));
							break;
						case '^':
							System.out.println("ϳ�������� �� �������� :\nA = " + (a*a)+"\nB = " + (b*b));
						case '&':
							int sum=a;
							if(b>0){
								for(int i= 1;i<b;i++){
									sum=sum*a;
								}
								System.out.println("ϳ�������� �� ������� -" +sum);
								break;
							}
							else{
								System.out.println("ϳ�������� �� ������� " + 0);
							}
					}
				
			}
}
