package Shape;

public abstract class Shape implements Interfase{
	private double x;
	private double y;
	public Point point;
		public Shape (Point point){
			this.point = point;
		}
		public double qetX(){
			return point.qetX();
			
		}
		public double qetY(){
			return point.qetY();
			
		}
}
