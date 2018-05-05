package figures;

public class parallelogram {
	public static double sideHeight(double AB,double h){
		double S;
		S = AB*h;
		return S;
	}
	public static double twosideAngle(double AB,double BC,double angle){
		double S;
		S = AB*BC*angle;
		return S;
	}
	public static double twoDiagonalAngle(double AC,double BD,double angle){
		double S;
		angle=angle*Math.PI/180;
		S = 1/2*AC*BD*Math.sin(angle);
		return S;
	}

}
