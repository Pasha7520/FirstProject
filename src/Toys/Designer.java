package Toys;

public class Designer extends Toy {
	private int plural;
		
			Designer(int price,int ageLimitsMin,int ageLimitsMax,int plural){
				super(price,ageLimitsMin,ageLimitsMax);
				this.plural = plural;
				
			}
		public void setPlural(int plural){
			this.plural = plural;
		}
		public int getPlural(){
			return plural;
		}@Override
		public String toString(){
			return "The prise of desingner "+getPrice()+"$ and age limit from "
					+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", number of possible designs "+getPlural();
		}
		public String toStringGrn(){
			return "The prise of desingner "+getPrice()+"grn and age limit from "
					+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", number of possible designs "+getPlural();
		}
		
}
