package figures;

public class Traingls {
	
		public static double sideHeight(double AB,double h){
			double S;
			S = (1.0/2.0)*AB*h;
			return S;
		}
	
		
		public static double threeParties(int AB,int BC, int CA){
			double p; double S;
			p=(AB+BC+CA)/2;
			S = Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
			return S;
		}
		public static double twoPartiesAngle(int AB,int BC,double angle){
			double S;
			angle=angle*Math.PI/180;
			System.out.println(angle);

			S = 1.0/2.0*AB*BC*Math.sin(angle);
			return S;
		}
		public static double threePartiesROP(int AB,int BC,int CA,double ROP){
			double S;
			S = AB*BC*CA/(4*ROP);
			return S;
		}
		public static double threeRVP(int AB,int BC,int CA,double RVP){
			double p = AB*BC*CA/2;
			double S = p*RVP;
			return S;
		}
}
