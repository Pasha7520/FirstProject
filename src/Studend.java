
public class Studend extends Person {
	private int room;
	private double alcohol;
	private String group;
		Studend(String name1,String sarname,int age,int phone,String address,int room,double alcohol,String group){
			super(name1,sarname,age,phone,address);
			this.room=room;
			this.alcohol=alcohol;
			this.group=group;
		}
		@Override
		public void printName(){
			System.out.println("Studend name is: "+qetName()+"and ser name is:"+qetSarName()+
					"and age is: "+qetAge()+"and phone is: "+qetPhone()+"and address is: "+qetAddress()+
					"and alcohol "+qetAlcohol()+"% and sturdy in"+qetGroup());
		}
		public void setRoom(int room){
			this.room=room;
		}
		public int qetRoom(){
			return room;
		}
		public void setAlcohol(double alcohol){
			if(alcohol>=0&&alcohol<=100){
			this.alcohol=alcohol;
			}
			else{
				this.alcohol = 0;
			}
		}
		public double qetAlcohol(){
				return alcohol;
		}
		public void setGroup(String group){
			this.group=group;
		}
		public String qetGroup(){
			return group;
		}
}
