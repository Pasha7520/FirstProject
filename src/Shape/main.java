package Shape;

public class main {

	public static void main(String[] args) {
		Point pointCircle = new Point(4,5);
		Circle circle = new Circle(6,pointCircle);
		
		Point [] point = new Point[10];
		for(int i = 0;i < point.length;i++){
			point[i]= new Point((int)Math.round(Math.random()*10),(int)Math.round(Math.random()*10));
			
		}
		circle.verPoint(point);
		circle.print();
		Point pPerm = new Point(10,20);
		circle.permitation(pPerm);
		circle.scale(3);
		circle.print();	
		circle.scale(-3);
		circle.print();	
		/////////////////////////////////////////////////////
		System.out.println("------------------------");
		Point pointCircleBig = new Point(20,20);
		Circle circleBig = new Circle(10,pointCircleBig);
		Point pointCircleSmall = new Point(15,20);
		Circle circleSmall = new Circle(5,pointCircleSmall);
		circleBig.verCircle(circleSmall);
		System.out.println("------------------------");
		Point pointA = new Point(10,10);
		Point pointB = new Point(10,20);
		Point pointC = new Point(20,10);

		Point point1 = new Point(10,10);
		
		Tringle tringle = new Tringle(pointA,pointB,pointC);
		tringle.print();
		tringle.permitation(point1);
		tringle.print();
		System.out.println(tringle.areas());
		tringle.scale(0);
		tringle.print();
		System.out.println("------------------------");
		Point A = new Point(10,10);
		Point B = new Point(10,20);
		Point C = new Point(20,20);
		Point D = new Point(20,10);
		

		Point y = new Point(110,10);
		Rectangle rectangle = new Rectangle(A,B,C,D);
		rectangle.print();
		System.out.println(rectangle.areas());
		rectangle.permitation(y);
		rectangle.print();
	}

}
