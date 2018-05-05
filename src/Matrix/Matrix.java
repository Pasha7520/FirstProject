package Matrix;

public class Matrix {
	private int [] [] matrix;
	
		Matrix(){
			
			}
			
		public void setSize	(int row,int column){
			matrix = new int[row][column];
		}
		
		
	

		public int getElement(int row, int column) {
			return matrix[row][column];
		}
	public int qetRow(){
		return matrix.length;
	}
	public int qetColumn(){
		return matrix[0].length;
	}
	public static Matrix creatMatrix(int row,int column){
		Matrix mt = new Matrix();
		mt.setSize(row, column);
		return mt;
	}
	public void setElements(int row,int column,int value){
		matrix [row][column] = value;
	}
	public void fill(){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=(int)(Math.random()*10);
			}
		}
	}
	public static void print(Matrix m){
		System.out.println("Matrix dimensions: ["+m.qetRow()+"; "+m.qetColumn()+"]");
		
		for(int i=0;i<m.qetRow();i++){
			for(int j=0;j<m.qetColumn();j++){
				System.out.print(m.getElement(i,j)+", ");
			}
			System.out.println("");
		}
		
	}
	public Matrix sum(Matrix m1,Matrix m2){
		int row1 = m1.qetRow();
		int col1 = m1.qetColumn();
		int row2 = m1.qetRow();
		int col2 = m1.qetColumn();
		
		if ((row1 == row2) && (col1 == col2)) {
			Matrix m3 = Matrix.creatMatrix(m1.qetRow(),m2.qetColumn());
		for(int i =0;i<m1.qetRow();i++){
			for(int j =0;j<m2.qetColumn();j++){
			
			m3.setElements(i,j,m1.getElement(i, j)+m2.getElement(i, j));
			}
		}
		return m3;
	}
		else return null;
		}
	public Matrix multiplication(Matrix m1,Matrix m2){
		int row1 = m1.qetRow();
		int col1 = m1.qetColumn();
		int row2 = m2.qetRow();
		int col2 = m2.qetColumn();
		if(col1 == row2){
			int res = 0;
			Matrix mt = Matrix.creatMatrix(row1, col2);
			for(int i = 0 ; i < row1 ;i++){
				for(int j = 0 ; j < col2 ;j++){
					for(int k = 0 ; k < col1 ;k++){
					res = res + (m1.getElement(i, k)*m2.getElement(k, j));
					}
					mt.setElements(i, j,res);
					res = 0;
				}
			}
			return mt;
		}
		else return null;
	}
	public static Matrix mulNum(Matrix m,int a){
		Matrix mN = Matrix.creatMatrix(m.qetRow(), m.qetColumn());
		for(int i=0 ; i < m.qetRow();i++){
			for(int j=0 ; j < m.qetColumn();j++){
				mN.setElements(i, j, a*m.getElement(i, j));
			}
		}
		return mN;
	}
	public static Matrix trans(Matrix m){
		Matrix mT=Matrix.creatMatrix(m.qetColumn(),m.qetRow());
		for(int i=0;i<m.qetRow();i++){
			for(int j=0;j<m.qetColumn();j++){
				mT.setElements(j, i, m.getElement(i, j));
			}
		}
		return mT;
	}
	}
	
	

