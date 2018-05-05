import java.util.Scanner;


public class mainbegin4 {
			public static void main(String[]args) {
				Scanner scn = new Scanner(System.in);
				System.out.println("Введи число ");
				int a = scn.nextInt();
				System.out.println("Введи число ");
				int b = scn.nextInt();
				char c = scn.next().charAt(0);
					switch (c){
						case '+':
							System.out.println("Сума " + (a+b));
							break;
						case '-':
							System.out.println("Різниця " + (a-b));
							break;
						case '*':
							System.out.println("Добуток " + (a*b));
							break;
						case '/':
							System.out.println("Частка " + (a/b));
							break;
						case '%':
							System.out.println("Остача " + (a%b));
							break;
						case '^':
							System.out.println("Піднесення до квадрату :\nA = " + (a*a)+"\nB = " + (b*b));
						case '&':
							int sum=a;
							if(b>0){
								for(int i= 1;i<b;i++){
									sum=sum*a;
								}
								System.out.println("Піднесення до степеня -" +sum);
								break;
							}
							else{
								System.out.println("Піднесення до степеня " + 0);
							}
					}
				
			}
}
