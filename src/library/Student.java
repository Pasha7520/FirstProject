package library;

public class Student extends Person {
	private int yearStudy;
		
	
			Student(int a){
				this.yearStudy = a;
			}
			public void setYear(int a){
				this.yearStudy = a;
			}
			public int qetYear(){
				return yearStudy;
			}
}
