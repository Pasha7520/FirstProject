package modul;

public class Calcul {
	public static void intove(int modul){
		if(modul < 0){
			modul=modul*(-1);
		}
		System.out.println("������ ������ ����� � "+modul);
	}
	public static void intove(long modul){
		if(modul < 0){
			modul=modul*(-1);
		}
		System.out.println("������ ������ ������� ����� � "+modul);
		
	}
	public static void intove(float modul){
		if(modul < 0){
			modul=modul*(-1);
		}
		System.out.println("������ ����� � ��������� ������� � "+modul);
	}
}
