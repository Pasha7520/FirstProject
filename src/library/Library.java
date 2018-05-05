package library;

public class Library implements Print {
	private int numDepartment;
	private Department [] departments;
	
			Library(int numDepartment){
				this.numDepartment=numDepartment;
				departments = new Department[numDepartment];
			}
			public void setDepartment(Department dep){
				for(int i=0;i < numDepartment;i++){
					if(departments[i]==null){
						departments[i]=dep;
					}
				}
			}
			public Department qetDepartment(int a){
				return departments[a];
			}
			@Override
			public void prints() {
				System.out.println("Librari have - "+numDepartment+" Department");
				
				
			}
	
}
