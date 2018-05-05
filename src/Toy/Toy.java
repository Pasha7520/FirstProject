package Toy;

public class Toy implements Comparable<Toy> {
	private String name;
	private int price;
	private int ageLimitsMin;
	private int ageLimitsMax;
	private int feature;
		Toy(){
			
		}
		Toy(String name,int price,int ageLimitsMin,int ageLimitsMax,int feature){
			this.name = name;
			this.price = price;
			this.ageLimitsMin = ageLimitsMin;
			this.ageLimitsMax = ageLimitsMax;
		}
		public void setName(String name){
			this.name = name;
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
		public void setFeature(int feature){
			this.feature = feature;
		}
		public int getFeature(){
			return feature;
		}
		public String getName(){
			return this.name;
		}
		@Override 
		public String toString(){
			if(this.name.equals("Ball")){
			return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
			+this.getPrice()+"$ and weight ball :"+this.feature;
			}
			else if(this.name.equals("Doll")){
			return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
						+this.getPrice()+"$ and length doll:"+this.feature;
			}
			else if(this.name.equals("Cubes")){
			return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
						+this.getPrice()+"$ and number cubes :"+this.feature;
			}
			else{
				return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
						+this.getPrice()+"$ and plural designer :"+this.feature;
			}
			
		}
		@Override
		public int compareTo(Toy t) {
			return toString().compareTo(t.toString());
		}
		public String toStringGrn(){
			double Grn = (this.price*27.33);
			String s = String.format("%.2f", Grn);
			String cop = s.substring(s.lastIndexOf(",")+1);
			
			
			if(this.name.equals("Ball")){
			return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
			+(int)Grn+" grn "+cop+" cop and weight ball :"+this.feature;
			}
			else if(this.name.equals("Doll")){
			return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
						+(int)Grn+" grn "+cop+" cop and length doll:"+this.feature;
			}
			else if(this.name.equals("Cubes")){
			return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
						+(int)Grn+" grn "+cop+" cop and number cubes :"+this.feature;
			}
			else{
				return this.name+" and age limit from :"+this.ageLimitsMin + " to :"+this.ageLimitsMax + " and price :"
						+(int)Grn+" grn "+cop+" cop and plural designer :"+this.feature;
			}
			
		}
		
}
