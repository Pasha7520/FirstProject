package continent;

public abstract class Continent {
	private int area;
	private int numCountry;
	private long generalPopulation;
		Continent(int area, int numCountry, long generalPopulation){
			this.area=area;
			this.numCountry=numCountry;
			this.generalPopulation=generalPopulation;
		}
		public void setArea(int area){
			this.area=area;
		}
		public void setNumCountry(int numCountry){
			this.numCountry=numCountry;
		}
		public void setGeneralPopulation(long generalPopulation){
			this.generalPopulation=generalPopulation;
		}
		public int qetArea(){
			return area;
		}
		public int qetNumCountry(){
			return numCountry;
		}
		public long qetGeneralPopulation(){
			return generalPopulation;
		}
		public void printnumCountry(){
			System.out.println("Кількість країн :"+qetNumCountry());
		}
		public void printArea(){
			System.out.println("Площа :"+qetArea());
		}
		public void printGeneralPopulation(){
			System.out.println("Загальне населення :"+qetGeneralPopulation());
		}
}
