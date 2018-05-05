import java.util.Scanner;


public class main8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введи валюту ");
		int n = scn.nextInt();double grn=0,usd=0,eur=0,pln=0,rub=0;
		if(n==1){
			System.out.println("Введи суму гривень! ");
			grn = scn.nextInt();
			usd = grn/25.4886;
			eur = grn/28.47;
			pln = grn/6.573;
			rub = grn*2.5533;
			System.out.println("Гривня = "+grn+">>>>"+" Доллар = "+usd+" Эвро = "+eur+" Польський злотий = "+pln+" Російський рубль= "+rub);

		}
		if(n==2){
			System.out.println("Введи суму долларів! ");
			usd = scn.nextInt();
			grn = usd*25.4886;
			eur = grn/28.47;
			pln = grn/6.573;
			rub = grn*2.5533;
			System.out.println(" Доллар = "+usd+">>>>"+"Гривня = "+grn+" Эвро = "+eur+" Польський злотий = "+pln+" Російський рубль= "+rub);
			
		}
		if(n==3){
			System.out.println("Введи суму эвро! ");
			eur = scn.nextInt();
			grn = eur*28.47;
			usd = grn/25.4886;
			pln = grn/6.573;
			rub = grn*2.5533;
			System.out.println(" Эвро = "+eur+">>>>"+" Доллар = "+usd+ "Гривня = "+grn+" Польський злотий = "+pln+" Російський рубль= "+rub);

		}
		if(n==4){
			System.out.println("Введи суму Польських злотих =");
			pln = scn.nextInt();
			grn = pln*6.573;
			usd = grn/25.4886;
			eur = grn/28.47;
			rub = grn*2.5533;
			System.out.println(" Польський злотий = "+pln+">>>>"+" Російський рубль= "+rub+" Эвро = "+eur+" Доллар = "+usd+ " Гривня = "+grn);

		}
		if(n==5){
			System.out.println("Введи суму Російських рублів =");
			rub = scn.nextInt();
			grn = rub/2.5533;
			usd = grn/25.4886;
			eur = grn/28.47;
			pln = grn/6.573;
			System.out.println(" Російський рубль= "+rub+">>>>"+" Польський злотий = "+pln+" Эвро = "+eur+" Доллар = "+usd+ " Гривня = "+grn);
			
		}
		if(n>5){ 
			System.out.println("Нема такої валюти в конвекторі");
			
		}
	}

}
