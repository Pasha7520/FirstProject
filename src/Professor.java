

public class Professor extends Teacher {
	private int nomCab;
	private String works;
		Professor(String name1,String sarname,int age,int phone,String address,String predmet,int sallary,int nomCab,String works){
			super(name1,sarname,age,phone,address,predmet,sallary);
			this.nomCab=nomCab;
			this.works=works;
		}
		@Override
		public void printName(){
			System.out.println("Professor name is: "+qetName()+"and ser name is:"+qetSarName()+
				"and age is: "+qetAge()+"and phone is: "+qetPhone()+"and address is: "+qetAddress()+
				"and qet"+qetSallary()+"$"+"and predmet "+qetPredmet()+"and writes "+qetWorks()+
					"and namber office"+qetNomCab());
		}
		public void setNomCab(int nomCab){
			this.nomCab=nomCab;
		}
		public int qetNomCab(){
			return nomCab;
		}
		public void setWorks(String works){
			this.works=works;
		}
		public String qetWorks(){
			return works;
		}
		private int calculetesallary(int predmet,int hours,int overtime,int grade){
			return (predmet*500)+(grade*500)+(hours*20)+(overtime*45);
		}
}
