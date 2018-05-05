package rectangle;

public class Rectangle {
	private Point B = new Point();
	private Point D = new Point();
	private Point A = new Point();
	private Point C = new Point();
	
		
		Rectangle(Point B,Point D){
			this.B=B;
			this.D=D;
			A.setX(B.qetX());A.setY(D.qetY());
			C.setX(D.qetX());C.setY(B.qetY());
		}
		public void print(){
			System.out.println("Rectangle: A(x"+B.qetX()+",y"+D.qetY()+");B(x"+B.qetX()+",y"+B.qetY()+");C(x"+D.qetX()+",y"+
		B.qetY()+");D(x"+D.qetX()+",y"+D.qetY()+")");
		}
		public double areas(){
			double AB = Math.sqrt(Math.pow(B.qetX()-B.qetX(),2)+Math.pow(B.qetY()-D.qetY(),2));
			double AD = Math.sqrt(Math.pow(B.qetX()-D.qetX(),2)+Math.pow(D.qetY()-D.qetY(),2));
			double S = AB*AD;
			return S;
		}
		public void verPoint(Point X){
			//1Big Tringle//1-Tringle ABX
			double AB = Math.sqrt(Math.pow(B.qetX()-B.qetX(),2)+Math.pow(B.qetY()-D.qetY(), 2));
			double BX = Math.sqrt(Math.pow(X.qetX()-B.qetX(),2)+Math.pow(X.qetY()-B.qetY(), 2));
			double XA = Math.sqrt(Math.pow(B.qetX()-X.qetX(), 2)+Math.pow(D.qetY()-X.qetY(), 2));
			
			double pABX = (AB+BX+XA)/2;
			double sABX = Math.sqrt(pABX*(pABX-AB)*(pABX-BX)*(pABX-XA));
			//2-Tringle BXC
			double BC = Math.sqrt(Math.pow(D.qetX()-B.qetX(), 2)+Math.pow(B.qetY()-B.qetY(), 2));
			double CX = Math.sqrt(Math.pow(X.qetX()-D.qetX(), 2)+Math.pow(X.qetY()-B.qetY(), 2));
			double XB = Math.sqrt(Math.pow(B.qetX()-X.qetX(), 2)+Math.pow(B.qetY()-X.qetY(), 2));
			
			double pBCX = (BC+CX+XB)/2;
			double sBCX = Math.sqrt(pBCX*(pBCX-BC)*(pBCX-CX)*(pBCX-XB));
			//3-Tringle AXC
			double AX = Math.sqrt(Math.pow(X.qetX()-B.qetX(), 2)+Math.pow(X.qetY()-D.qetY(), 2));
			double XC = Math.sqrt(Math.pow(D.qetX()-X.qetX(), 2)+Math.pow(B.qetY()-X.qetY(), 2));
			double CA = Math.sqrt(Math.pow(B.qetX()-D.qetX(),2)+Math.pow(D.qetY()-B.qetY(), 2));
			
			double pAXC = (AX+XC+CA)/2;
			double sAXC = Math.sqrt(pAXC*(pAXC-AX)*(pAXC-XC)*(pAXC-CA));
			
			float sSum1 =  (float)(sABX+sBCX+sAXC);
			System.out.println(sSum1);
			//2Big Tringle//1-Tringle ACX
			double AC1 = Math.sqrt(Math.pow(D.qetX()-B.qetX(),2)+Math.pow(B.qetY()-D.qetY(), 2));
			double CX1 = Math.sqrt(Math.pow(X.qetX()-D.qetX(), 2)+Math.pow(X.qetY()-B.qetY(), 2));
			double XA1 = Math.sqrt(Math.pow(B.qetX()-X.qetX(), 2)+Math.pow(D.qetY()-X.qetY(), 2));
			
			double pACX1 = (AC1+CX1+XA1)/2;
			double sACX1 = Math.sqrt(pACX1*(pACX1-AC1)*(pACX1-CX1)*(pACX1-XA1));
			//2-Tringle XCD
			double XC1 = Math.sqrt(Math.pow(D.qetX()-X.qetX(),2)+Math.pow(B.qetY()-X.qetY(), 2));
			double CD1 = Math.sqrt(Math.pow(D.qetX()-D.qetX(),2)+Math.pow(D.qetY()-B.qetY(), 2));
			double DX1 = Math.sqrt(Math.pow(X.qetX()-D.qetX(), 2)+Math.pow(X.qetY()-D.qetY(), 2));
			
			double pXCD1  = (XC1+CD1+DX1)/2;
			double sXCD1 = Math.sqrt(pXCD1*(pXCD1 -XC1)*(pXCD1-CD1)*(pXCD1-DX1));
			//3 -tribgle AXD
			double AX1 = Math.sqrt(Math.pow(X.qetX()-B.qetX(),2)+Math.pow(X.qetY()-D.qetY(), 2));
			double XD1 = Math.sqrt(Math.pow(D.qetX()-X.qetX(),2)+Math.pow(D.qetY()-X.qetY(), 2));
			double DA1 = Math.sqrt(Math.pow(B.qetX()-D.qetX(), 2)+Math.pow(D.qetY()-D.qetY(), 2));
			
			double pAXD1 = (AX1+XD1+DA1)/2;
			double sAXD1 = Math.sqrt(pAXD1*(pAXD1-AX1)*(pAXD1-XD1)*(pAXD1-DA1));
			
			float sSum2 = (float)(sACX1+sXCD1+sAXD1);
			System.out.println(sSum2);
			if(sSum1==(areas()/2)||sSum2==(areas()/2)){
				System.out.println("Point (x"+X.qetX()+",y"+X.qetY()+")  is in the range of Rectangle: A(x"+B.qetX()+",y"+D.qetY()+");B(x"+B.qetX()+",y"+B.qetY()+");C(x"+D.qetX()+",y"+
		B.qetY()+");D(x"+D.qetX()+",y"+D.qetY()+")");
			}
			else {System.out.println("Point (x"+X.qetX()+",y"+X.qetY()+")  isn't in the range of Rectangle: A(x"+B.qetX()+",y"+D.qetY()+");B(x"+B.qetX()+",y"+B.qetY()+");C(x"+D.qetX()+",y"+
					B.qetY()+");D(x"+D.qetX()+",y"+D.qetY()+")");
			}
			
	
		}
		public void scalePointB(int m){
			double lon = Math.sqrt(Math.pow(B.qetX()-A.qetX(),2)+Math.pow(B.qetY()-A.qetY(), 2));
			if(m > 0){
				C.setX(C.qetX()*m);
				D.setX(D.qetX()*m);
				
				A.setY(A.qetY()-(lon*(m-1)));
				D.setY(D.qetY()-(lon*(m-1)));
			}
			if(m < 0){
				C.setX(C.qetX()/m);
				D.setX(D.qetX()/m);
			
				A.setY(A.qetY()*m);
				D.setY(D.qetY()*m);
		}
}
		public void permitation(Point p){
			double xOld = B.qetX();
			double yOld = B.qetY();
			double bNewX = (B.qetX()-p.qetX());
			double bNewY = (B.qetY()-p.qetY());
				if(bNewX!=xOld){
					if(bNewX < 0){
						B.setX(xOld+(bNewX*(-1)));
						A.setX(A.qetX()+(bNewX*(-1)));
						System.out.println(B.qetX());
						C.setX(C.qetX()+(bNewX*(-1)));
						D.setX(D.qetX()+(bNewX*(-1)));
					}
					else{
						B.setX(xOld-bNewX);
						A.setX(A.qetX()-bNewX);
						C.setX(C.qetX()-bNewX);
						D.setX(D.qetX()-bNewX);
					}
				}
				if(bNewY!=yOld){
					if(bNewY < 0){
						B.setY(yOld+(bNewY*(-1)));
						A.setY(A.qetY()+(bNewY*(-1)));
						System.out.println(A.qetY());
						System.out.println(bNewY);
						C.setY(C.qetY()+(bNewY*(-1)));
						D.setY(D.qetY()+(bNewY*(-1)));
					}
					else{
						B.setY(yOld-bNewY);
						A.setY(A.qetY()-bNewY);
						C.setY(C.qetY()-bNewY);
						D.setY(D.qetY()-bNewY);
						
					}
				}
			
			
		}
		public void verPointNew(Point p){
			double xMin = A.qetX();
			double yMin = A.qetY();
			
			double xMax = C.qetX();
			double yMax = C.qetY();
			if(xMin < p.qetX() && p.qetX() < xMax && yMin < p.qetY()&&p.qetY() < yMax){
				System.out.println("Yes");
			}
			else System.out.println("No");
			
			
			
		}
}