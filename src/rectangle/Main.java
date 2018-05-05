package rectangle;

public class Main {

	public static void main(String[] args) {
		Point B = new Point(10,20);
		Point D = new Point(30,10);
		Rectangle r1 = new Rectangle(B,D);
		r1.print();
		/////////////
		Point V = new Point(25,35);
		r1.verPoint(V);
		//r1.scalePointB(2);
		r1.print();
		/////
		System.out.println("----------------------");
		Point a = new Point(20,40);
		r1.permitation(a);
		r1.print();
		r1.verPointNew(V);
	}

}
