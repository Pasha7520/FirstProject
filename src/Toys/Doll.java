package Toys;

public class Doll extends Toy{
	private int lon;
		Doll(int price, int ageLimitsMin,int ageLimitsMax,int lon){
			super(price,ageLimitsMin,ageLimitsMax);
			this.lon = lon;
		}
	public void setLon(int lon){
		this.lon = lon;
	}
	public int getLon(){
		return lon;
	}
	@Override
	public String toString(){
		
		
		return "The prise of doll "+getPrice()+"$ and age limit from "
		+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", legth of the doll "+getLon();
	}
public String toStringGrn(){
		
		
		return "The prise of doll "+getPrice()+"grn and age limit from "
		+getAgeLimitsMin()+" to "+getAgeLimitsMax()+", legth of the doll "+getLon();
	}
		
}
