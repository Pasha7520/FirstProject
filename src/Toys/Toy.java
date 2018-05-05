package Toys;

import java.util.Comparator;

public class Toy implements Comparable<Toy>{
	private int price;
	private int ageLimitsMin;
	private int ageLimitsMax;
		Toy(){
			
		}
		Toy(int price,int ageLimitsMin,int ageLimitsMax){
			this.price = price;
			this.ageLimitsMin = ageLimitsMin;
			this.ageLimitsMax = ageLimitsMax;
			
		}
	public void setPrise(int price){
		this.price = price;
	}
	public void setAgeLimitsMin(int ageLimitsMin){
		this.ageLimitsMin = ageLimitsMin;
	}
	public void setAgeLimitsMax(int ageLimitsMax){
		this.ageLimitsMax = ageLimitsMax;
	}
	public int getPrice(){
		return price;
	}
	public int getAgeLimitsMax(){
		return ageLimitsMax;
	}
	public int getAgeLimitsMin(){
		return ageLimitsMin;
	}
	@Override
	public String toString(){
		
		return "The prise of Toy"+Integer.toString(this.price)+"and age limit from "+this.ageLimitsMin+" to "+this.ageLimitsMax ;
	}
	@Override
	public int compareTo(Toy o) {
		return ((Integer)this.price).compareTo((Integer)o.getPrice());
	}
public String toStringGrn(){
		
		return "The prise of Toy"+Integer.toString(this.price)+"and age limit from "+this.ageLimitsMin+" to "+this.ageLimitsMax ;
	}
	
	
}
