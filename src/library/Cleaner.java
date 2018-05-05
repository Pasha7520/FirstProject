package library;

public class Cleaner extends Person implements Print {
	private int sallary;
		Cleaner(String name,String nickName,String serName,int age,int sallary){
			super(name,nickName,serName,age);
			this.sallary=sallary;
			
		}
		
		public void setSallary(int sallary){
			this.sallary=sallary;
		}
		
		
		public int qetSallary(){
			return sallary;
		}
		public int calculateSallary(int hours,int overtime){
			return this.sallary=(hours*16)+(overtime*32);
		}

		@Override
		public void prints() {
			System.out.println("Cleaner "+ qetName()+"nickName"+ qetSerName()+"+serName+"+qetAge()+"+age+"+qetSallary()+"+sallary");
			
		}

}
