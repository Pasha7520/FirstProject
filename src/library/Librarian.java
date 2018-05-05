package library;

public class Librarian extends Person implements Print {
	private int sallary;
		Librarian(String name,String nickName,String serName,int age,int sallary){
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
				return this.sallary=(hours*20)+(overtime*40);
			}
			@Override
			public void prints() {
				System.out.println("librarian "+ qetName()+"nickName"+ qetSerName()+"+serName+"+qetAge()+"+age+"+sallary+"+sallary");
				
			}
		
		}
		
