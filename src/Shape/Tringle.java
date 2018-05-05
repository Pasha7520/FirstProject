package Shape;

public class Tringle extends Shape implements Interfase  {
	private Point pB;
	private Point pC;
		
	
	public Tringle(Point point,Point pB,Point pC) {
		super(point);
		this.pB=pB;
		this.pC=pC;
		
	}

	@Override
	public void print() {
		System.out.println("tringle A(x"+point.qetX()+",y"+point.qetY()+");B(x"+pB.qetX()
				+",y"+pB.qetY()+");C(x"+pC.qetX()+",y"+pC.qetY()+")");
		
	}

	@Override
	public void permitation(Point p) {
		double xOld = point.qetX();
		double yOld = point.qetY();
		double x1 = p.qetX();
		double y1 = p.qetY();
		
		double xNew = xOld-x1;
		double yNew = yOld-y1;
		if(!(x1==xOld)){
			if(xNew < 0){
				point.setX(xOld+(xNew*(-1)));
				pB.setX(pB.qetX()+(xNew*(-1)));
				pC.setX(pC.qetX()+(xNew*(-1)));
			}
			else{
				point.setX(xOld-xNew);
				pB.setX(pB.qetX()-xNew);
				pC.setX(pC.qetX()-xNew);
			}
		}
		if(!(y1==yOld)){
			if(yNew < 0){
				point.setY(yOld+yNew*(-1));
				pB.setY(pB.qetY()+yNew*(-1));
				pC.setY(pC.qetY()+yNew*(-1));
			}
			else{
					point.setY(yOld-yNew);
					pB.setY(pB.qetY()-yNew);
					pC.setY(pC.qetY()-yNew);
				
			}
		}
	}

	@Override
	public void scale(int m) {
		if(m!=0){
			if(m > 0){
			pB.setX(pB.qetX()*m);
			pB.setY(pB.qetY()*m);
			pC.setX(pC.qetX()*m);
			pC.setY(pC.qetY()*m);
		}
			if(m < 0){
				pB.setX(pB.qetX()/m);
				pB.setY(pB.qetY()/m);
				pC.setX(pC.qetX()/m);
				pC.setY(pC.qetY()/m);	
			}
		
	}
		if(m==0){
			System.out.println("Scale=0 !!!");
		}
	}
	@Override
	public double areas() {
		double AB = Math.sqrt(Math.pow(pB.qetX()-point.qetX(),2)+Math.pow(pB.qetY()-point.qetY(), 2));
		double BC = Math.sqrt(Math.pow(pC.qetX()-pB.qetX(), 2)+Math.pow(pC.qetY()-pB.qetY(),2));
		double CA = Math.sqrt(Math.pow(point.qetX()-pC.qetX(),2)+Math.pow(point.qetY()-pC.qetY(), 2));
		
		double p = (AB+BC+CA)/2;
		double S = Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
		return S;
	}

}
