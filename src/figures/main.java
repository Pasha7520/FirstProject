package figures;

public class main {

	public static void main(String[] args) {
		System.out.println(Traingls.sideHeight(8,6.0));
		System.out.println(Traingls.threeParties(8,6,6));
		System.out.println(Traingls.twoPartiesAngle(8,8,90));
		System.out.println(Traingls.threePartiesROP(5,6,4,3));
		System.out.println(faktorial(5));

	}
	public static int faktorial(int a){
		if(a>1){
			a=a*faktorial(a-1);
			
		}
		if(a==1){
			return a;
		}
		return a;
	}

}
