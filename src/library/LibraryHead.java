package library;

public class LibraryHead extends DepartmentHead implements Print {
	LibraryHead(String name,String nickName,String serName,int age,int sallary){
		super(name,nickName,serName,age,sallary);
	}
		@Override
		public int calculateSallary(int hours,int overtime){
			return (hours*28)+(overtime*56);
		
	}
		@Override
		public void prints(){
			System.out.println("LibraryHead "+ qetName()+"nickName"+ qetSerName()+"+serName+"+qetAge()+"+age+"+qetSallary()+"+sallary");
		}
}
