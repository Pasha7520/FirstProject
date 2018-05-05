package rectangle;

public class Point {
	private double x,y;
		
		Point(){
			
		}
		Point(double x,double y){
			this.x=x;
			this.y=y;
			
		}
		public void setX(double x){
			this.x=x;
		}
		public void setY(double y){
			this.y=y;
		}
		public double qetX(){
			return x;
		}
		public double qetY(){
			return y;
		}
		public void print(){
			System.out.println("Point (x"+x+",y"+y+")");
		}
		
}
