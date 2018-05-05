package Man;

public class Person {
	private String name;
	private int age;
	private String sex;
	private double weight;
			
			Person(){
				
			}
			Person(String name,int age,String sex, double weight){
				this.name = name;
				this.age = age;
				this.sex = sex;
				this.weight = weight;
			}
		public void setName(String name){
			this.name = name;
		}
		public void setAge(int age){
			this.age = age;
		}
		public void setSex(String sex){
			this.sex = sex;
		}
		public void setWeight(){
			this.weight=weight;
		}
		public String qetName(){
			return name;
		}
		public int qetAge(){
			return age;
		}
		public String qetSex(){
			return sex;
		}
		public double qetWeight(){
			return weight;
		}
		public void print(){
			System.out.println("Person Name is:"+qetName()+",age-"+qetAge()+",sex-"+qetSex()+",weigth-"+qetWeight());
		}
			
}
