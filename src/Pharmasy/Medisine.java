package Pharmasy;

public class Medisine implements Comparable<Medisine> {
	private String name;
	private int price;
	private int number;
	
			Medisine(){
				
			}
			
			Medisine(String name,int price,int number){
				this.name=name;
				this.price=price;
				this.number = number;
			}
			
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	public int getNumber(){
		return this.number;
	}
	@Override
	public int compareTo(Medisine m) {
		// TODO Auto-generated method stub
		return this.name.compareTo(m.getName());
	}
}
