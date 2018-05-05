package Matrix;

public class main {

	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.setSize(2, 3);
		Matrix m2 = new Matrix();
		m2.setSize(3, 2);
		m1.fill();
		m2.fill();
		Matrix.print(m1);
		Matrix.print(m2);
		

		Matrix.print(m1.multiplication(m1,m2));
		Matrix.print(Matrix.mulNum(m1, 2));
		////////////Trans;
		
		Matrix mT = new Matrix();
		mT.setSize(2, 5);
		mT.fill();

		Matrix.print(mT);
		Matrix.print(Matrix.trans(mT));

	}

}
