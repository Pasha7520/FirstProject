


public class Teacher extends Person {
	private String predmet;
	private int sallary;
		Teacher(String name1,String sarname,int age,int phone,String address,String predmet,int sallary){
			super(name1,sarname,age,phone,address);
			this.predmet=predmet;
			this.sallary=sallary;
		}
		@Override
		public void printName(){
			System.out.println("Teacher name is: "+qetName()+"and ser name is:"+qetSarName()+
				"and age is: "+qetAge()+"and phone is: "+qetPhone()+"and address is: "+qetAddress()+
				"and qet"+qetSallary()+"$"+"and predmet "+qetPredmet());
			
		}
		public void setPredmet(String predmet){
			this.predmet=predmet;
		}
		public String qetPredmet(){
			
			return predmet;
		}
		public void setSallary(){
			
				this.sallary=calculetesallary(0,0,0);
			
		}
		public int qetSallary(){
			return sallary;
		}
		private int calculetesallary(int predmet,int hours,int overtime){
			return (predmet*500)+(hours*20)+(overtime*45);
		}
		

}
