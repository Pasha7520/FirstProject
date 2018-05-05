package library;

public class DepartmentHead extends Librarian implements Print {
	DepartmentHead(String name,String nickName,String serName,int age,int sallary){
		super(name,nickName,serName,age,sallary);
	}
		@Override
		public int calculateSallary(int hours,int overtime){
			return (hours*22)+(overtime*44);
			
		}
		
		@Override
		public void prints(){
			System.out.println("DepartmentHead "+ qetName()+"nickName"+ qetSerName()+"+serName+"+qetAge()+"+age+"+qetSallary()+"+sallary");
		}
	}

