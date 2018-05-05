package Toys;

public class Cubes extends Toy {
	private int number;
			
			Cubes(int price,int ageLimitsMin,int ageLimitsMax,int number){
				super(price,ageLimitsMin,ageLimitsMax);
				this.number = number;
			}	
		public void setNumber(int number){
			this.number = number;
		}
		public int getNumber(){
			return number;
		}
		@Override
		public String toString(){
			return "The prise of cubes "+getPrice()+"$ and age limit from "
					+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", quantity in the set "+getNumber();
		}
		public String toStringGrn(){
			return "The prise of cubes "+getPrice()+"grn and age limit from "
					+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", quantity in the set "+getNumber();
		}
}
