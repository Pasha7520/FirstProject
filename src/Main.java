import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int a , b ;
		
		Scanner scn = new Scanner(System.in); //Створення сканера для зчитування даних з консолі (сам вводиш)
		
		
		System.out.println("Введи а: ");
		a=scn.nextInt(); //зчитування цілого числа А з клавіатури
		
		System.out.println("Введи б: ");
		b=scn.nextInt(); //зчитування цілого числа Б з клавіатури
		
		char c = scn.next().charAt(0);
		 switch (c){
		 case '+':
			 System.out.println("Сума "+(a+b));
			break;
		 case '-':
			 
			 if((a-b)<0){
				 System.out.println("Різниця "+(-(a-b)));				 
			 }else {
				 System.out.println("Різниця "+ (a-b));
			 }
			break;
		 case '*':
			 System.out.println("Добуток "+a*b);
			break;
		 case '/':
			 System.out.println("Частка "+a/b);
			break;
		 case'%':
			 System.out.println("Остача "+(a%b));
		 	break;
		 case'^':
			 System.out.println("Піднесення до квадрату :\nA = "+ (a*a)+"\nB = "+ (b*b));
		 break;
		 case'&': 
			 int sum=a;;
		 
			 for(int i=1;i<b;i++){
				 sum=sum*a;
				
			 }
			 
			 System.out.println("Піднесення до степеня "+ sum);
			 break;
			 
		default : 
			System.out.println("Пацан ти ввів хуйню");
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

