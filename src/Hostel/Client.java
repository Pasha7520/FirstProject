package Hostel;

public class Client {
	String name ;
	String nickName;
	String serName;
	int num ;
	String sex;
	public Date date;
	int tel;
			
			
			Client(String name,String nickName,String serName,String sex,Date date,int num,int tel){
				this.name = name;
				this.nickName = nickName;
				this.serName = serName;
				this.sex = sex;
				this.date = date;
				this.tel = tel;
				this.num = num;
			}
			
			
	public void setName(String name){
		this.name = name;
	}
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public void setSerName(String serName){
		this.serName = serName;
	}
	public void setNum(int num){
		this.num = num;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setTel(int tel){
		this.tel = tel;
	}
	public String qetName(){
		return name;
	}
	public String qetSerName(){
		return serName;
	}
	public String qetNickName(){
		return nickName;
	}
	public int qetNum(){
		return num;
	}
	public String qetSex(){
		return sex;
	}
	public int qetTel(){
		return tel;
	}
	public void print(){
		System.out.println("Client full name: "+qetNickName()+" "+qetName()+" "+qetSerName()+", sex:"+qetSex()+", full date of birth:"+date.qetDay()+
				"."+date.qetMonth()+"."+date.qetYear()+"year, number room: "+qetNum()+", Telefon"+qetTel());
	}
	public int qetDay(){
		return date.qetDay();
	}
	public int qetMonth(){
		return date.qetMonth();
	}
	public int qetYear(){
		return date.qetYear();
	}
	
		
		


}
