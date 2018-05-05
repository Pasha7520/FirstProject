package library;

public abstract class Person {
	private String name;
	private String nickName;
	private String serName;
	private int age;
	
		 Person(String name,String nickName,String serName,int age){
			this.name=name;
			this.nickName=nickName;
			this.serName=serName;
			this.age=age;
			
		}
		 Person(){
				name="empty";
				nickName="empty";
				serName="empty";
				age=0;
				
			}
		public void setName(String name){
			this.name=name;
		}
		
		public void setNickName(String nickName){
			this.nickName=nickName;
		}
		
		public void setSerName(String serName){
			this.serName=serName;
		}
		
		public void setAge(int age){
			this.age=age;
		}
		
		
		
		public String qetName(){
			return name;
		}
		
		public String qetNickName(){
			return nickName;
		}
		
		public String qetSerName(){
			return serName;
		}
		
		public int qetAge(){
			return age;
		}
		
		
}
