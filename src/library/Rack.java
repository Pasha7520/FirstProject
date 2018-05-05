package library;

public class Rack implements Print{
	private int bracket;
	private int width;
	private Book[][] placeBook;
	
		Rack(int bracket,int width){
			this.bracket=bracket;
			this.width=width;
			placeBook = new Book[bracket][width];
		}
		public void setBracket(int bracket){
			this.bracket=bracket;
		}
		
		public void setWidth(int width){
			this.width=width;
		}
		
		public int qetBracket(){
			return bracket;
		}
		public int qetWidth(){
			return width;
		}
		public void addPlaceBook(Book book){
			for(int i=0;i <= bracket;i++){
				for(int j=0;j <= width;j++){
					if(placeBook[i][j]==null){
						placeBook[i][j]=book;
						break;
					}
				}
			}
		}
		public void setPlaceBook(Book book,int bracket,int width){
			placeBook[bracket][width]=book;
		}
		public Book qetBook(int bracket,int width){
			return placeBook[bracket][width];
		}
		@Override	
		public void prints() {
			System.out.println("Rack bracketwidth"+bracket+"bracket width"+width);
			System.out.println("and Books");
			for(int i=0;i < bracket;i++){
				for(int j=0;j < width;j++){
					System.out.println("bracket "+i+"width "+j);
					System.out.println(placeBook[i][j]);
				}
			}
		}
}
