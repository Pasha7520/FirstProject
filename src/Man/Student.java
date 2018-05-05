package Man;


public class Student extends Person {
		private int yearStudy;	
		
				public Student(String name,int age,String sex, double weight,int a){
					super(name,age,sex,weight);
					this.yearStudy = a;
				}
		public void setYear(int a){
					this.yearStudy = a;
				}
		public int qetYear(){
					return yearStudy;
				}
		@Override
		public void print(){
			System.out.println("Person(St) Name is:"+qetName()+",age-"+qetAge()+",sex-"+qetSex()+",weigth-"+qetWeight()+",year-"+qetYear());
		}
}
