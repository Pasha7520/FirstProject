package Toys;

public class Ball extends Toy {
	private int weight;
			Ball(){
				
			}
			Ball(int price ,int ageLimitsMin,int ageLimitsMax,int weight){
				super(price,ageLimitsMin,ageLimitsMax);
				this.weight = weight;
			}
		public void setWeight(int weigth){
			this.weight = weight;
		}
		public int getWeight(){
			return weight;
		}
		@Override
		public String toString(){
			return "The prise of ball "+getPrice()+"$ and age limit from "
					+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", weight of the ball "+getWeight();
		}
		public String toStringGrn(){
			return "The prise of ball "+getPrice()+"grn and age limit from "
					+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", weight of the ball "+getWeight();
		}
		
}
