package Shape;

public class Rectangle extends Shape implements Interfase {
	private Point pB,pC,pA;

		Rectangle(Point point , Point pB , Point pC , Point pA){
			super(point);
			this.pA = pA;
			this.pB = pB;
			this.pC = pC;
			
		}
	@Override
	public void print() {
		System.out.println("Rectangle A(x"+point.qetX()+",y"+point.qetY()+");B(x"+pB.qetX()+",y"+pB.qetY()+");C(x"
				+pC.qetX()+",y"+pC.qetY()+");D(x"+pA.qetX()+",y"+pA.qetY()+")");
		
	}

	@Override
	public void permitation(Point p) {
		double xOld = point.qetX();
		double yOld = point.qetY();
		double x1 = p.qetX();
		double y1 = p.qetY();
		
		double xNew = xOld - x1;
		double yNew = yOld - y1;
		if(x1!=xOld){
			if(xNew < 0){
				point.setX(xOld+(xNew*(-1)));
				pA.setX(pA.qetX()+(xNew*(-1)));
				pB.setX(pB.qetX()+(xNew*(-1)));
				pC.setX(pC.qetX()+(xNew*(-1)));
			}
			else {
				point.setX(xOld-xNew);
			pA.setX(pA.qetX()-xNew);
			pB.setX(pB.qetX()-xNew);
			pC.setX(pC.qetX()-xNew);
			}
		}
		if(y1!=yOld){
			if(yNew < 0){
				point.setY(yOld+(yNew*(-1)));
				pB.setY(pB.qetY()+(yNew*(-1)));
				pC.setY(pC.qetY()+(yNew*(-1)));
				pA.setY(pA.qetY()+(yNew*(-1)));
			}
			else{
				point.setY(yOld-yNew);
				pB.setY(pB.qetY()-yNew);
				pC.setY(pC.qetY()-yNew);
				pA.setY(pA.qetY()-yNew);

				
			}
		}
		
		
	}

	@Override
	public void scale(int m) {
		if(m > 0){
			pA.setX(pA.qetX()*m);
			pB.setX(pB.qetX()*m);
			pC.setX(pC.qetX()*m);
			
		
			pA.setY(pA.qetY()*m);
			pB.setY(pB.qetY()*m);
			pC.setY(pC.qetY()*m);
		}
		if(m < 0){
			pA.setX(pA.qetX()/m);
			pB.setX(pB.qetX()/m);
			pC.setX(pC.qetX()/m);
		
	
			pA.setY(pA.qetY()/m);
			pB.setY(pB.qetY()/m);
			pC.setY(pC.qetY()/m);
			
		}
		
		
	}

	@Override
	public double areas() {
		double s = Math.sqrt(Math.pow(pB.qetX()-point.qetX(),2)+Math.pow(pB.qetY()-point.qetY(), 2));
		System.out.println(s);
		s=s*s;
		return s;
	}

}
