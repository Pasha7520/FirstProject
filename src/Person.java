
public abstract class Person {
	private String name;
	private String Sarname;
	private int age;
	private int phone;
	private String address;
		
		Person(){
			name = "human";
		}
		
		Person(String name1,String sarname,int age,int phone,String address){
			name=name1;
			Sarname=sarname;
			this.age=age;
			this.phone=phone;
			this.address=address;
		}
		
		public void printName(){
			System.out.println("Human name is:"+name);
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String qetName(){
			return name;
		}
		
		public void setSerName(String Sarname){
			this.Sarname=Sarname;
		}
		public String qetSarName(){
			return Sarname;
		}
		public void setAge(int age){
			this.age=age;
		}
		public int qetAge(){
			return age;
		}
		public void setPhone(int phone){
			this.phone = phone;
		}
		public int qetPhone(){
			return phone;
		}
		public void setAddres(String address){
			this.address=address;
		}
		public String qetAddress(){
			return address;
		}
}
