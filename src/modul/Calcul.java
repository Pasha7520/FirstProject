package modul;

public class Calcul {
	public static void intove(int modul){
		if(modul < 0){
			modul=modul*(-1);
		}
		System.out.println("Модуль цілого числа э "+modul);
	}
	public static void intove(long modul){
		if(modul < 0){
			modul=modul*(-1);
		}
		System.out.println("Модуль цілого довгого числа э "+modul);
		
	}
	public static void intove(float modul){
		if(modul < 0){
			modul=modul*(-1);
		}
		System.out.println("Модуль числа з плаваючою крапкою э "+modul);
	}
}
