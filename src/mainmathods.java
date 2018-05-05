import java.util.Scanner;


public class mainmathods {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Привет");
		System.out.println("Введи вираз");
		String S = new String();
		String Sfirst = new String();
		String Ssecond = new String();
		String Saction =new String();

		int a=0;
		int first,second;
		char action ;
		
		/*first = scn.nextInt();
		second = scn.nextInt();
		action = scn.next().charAt(0);*/
		S = scn.next();
		for(int i =0;i < S.length();i++){
			if(S.charAt(i)=='0' || S.charAt(i)=='1' || S.charAt(i)=='2' || S.charAt(i)=='3' || S.charAt(i)=='4' || S.charAt(i)=='5' || S.charAt(i)=='6'
					|| S.charAt(i)=='7' || S.charAt(i)=='8' || S.charAt(i)=='9' ){
				if(a<1)Sfirst=Sfirst+S.charAt(i);
				if(!(a<1))Ssecond=Ssecond+S.charAt(i);
			}
			else{
				Saction=Saction+S.charAt(i);
				a++;
			}
		}
		first = Integer.parseInt(Sfirst);
		second = Integer.parseInt(Ssecond);
		action=Saction.charAt(0);
		double sum = calculation(first,second,action);
		printResolt(first,second,action,calculation(first,second,action));
	

	}
	
	private static double calculation(int first , int second , char action){
		switch(action){
		case '+':
			return first + second;
		case '-':
			return first - second;
		case '*': 
			return first * second;
		case '/':
			return first / second;
		case '^':
			int step = first;
			for(int i = 1;i < second;i++){
				step = step*first;
				
			}
			return step;
		case 'v':
			double dSecond = second;
			return Math.pow(first, 1/dSecond);
		default : return 0;
		}
		
	}
	private static void printResolt(int first,int second,char action,double sum){
		System.out.println("В результаті виконання завдання, ми отримали, перше чилсло то є: " + first + " та друге "
				+ second + " та дію \""+action+"\" отримали результат "+sum  );
	}

}
