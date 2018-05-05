package Shape;

public class Circle extends Shape implements Interfase {
	double r ;
	
		Circle(double r,Point point){
			super(point);
			this.r = r;
		}

		
	
	
	public void setRadius(double r){
		this.r = r  ;
	}
	public double qetRadius(){
		return r;
	}
	
	@Override
	public void print() {
		System.out.println("Circle Radius-"+r+" and center point (x="+point.qetX()+";y="+point.qetY()+")");
		
	}

	@Override
	public void permitation(Point p) {
		point.setX(p.qetX());
		point.setY(p.qetY());
	}

	@Override
	public void scale(int m) {
		if(m>0)
		r=r*m;
		else {
			m=m*-1;
			r=r/m;
		}
	}
		

	@Override
	public double areas() {
		double area;
		area = (r*r)*Math.PI;
		return area;
	}
	
	public boolean verPoint(Point p){
		double x = p.qetX();
		double y = p.qetY();
		
		double xC = point.qetX();
		double yC = point.qetY();
		
		
		if(Math.pow(xC - x, 2) + Math.pow(yC - y, 2) <= Math.pow(r,2)) {
			return true;
		}
		else return false;
	}
	public void verPoint(Point []p){
		for(int i = 0; i < p.length; i++){
			int f = i+1;
			if(Math.pow(point.qetX() - p[i].qetX(), 2) + Math.pow(point.qetY() -p[i].qetY(), 2) <= Math.pow(r,2)){
				System.out.println("Point ¹"+i+"(x -"+p[i].qetX()+"; y -"+p[i].qetY()+") res = "+true);
			}
			else System.out.println("Point ¹"+f+"(x -"+p[i].qetX()+"; y -"+p[i].qetY()+") res = "+false);
		}
	}
	public void verCircle(Circle c){
		double rS = c.qetRadius();
		double xBig = point.qetX();
		double yBig = point.qetY();
		double rB = qetRadius();
		double xSmall = c.qetX();
		double ySmall = c.qetY();
		if(Math.pow(xBig-xSmall, 2)+Math.pow(yBig-ySmall,2)<=Math.pow(rB-rS, 2)){
		System.out.println("Circle Radius-"+rB+" and center point (x="+c.qetX()+";y="+c.qetY()+
				") is in the range of "+"Circle Radius-"+rS+" and center point (x="+point.qetX()+";y="+point.qetY()+
				")");
		}
		else {
			System.out.println("Circle Radius-"+rB+" and center point (x="+c.qetX()+";y="+c.qetY()+
				") isn't in the range of"+"Circle Radius-"+rS+" and center point (x="+point.qetX()+";y="+point.qetY()+
				")");
		}
	}
	

}
