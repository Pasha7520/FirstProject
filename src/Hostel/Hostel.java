package Hostel;

public class Hostel {
	private Client [] c;
			
			Hostel(int row ){
			c = new Client[row];	
			}
	public void setClient(Client e,int a){
		c[a]=e;
	}
	
	public void addClient(Client client){
		for(int i=0;i < c.length;i++){
			if(c[i]==null){
				c[i]=client;
				break;
			}
		}
		
	}
	public void print(){
		for(int i=0;i < c.length;i++){
			if(c[i]!=null){
				int l=i+1;
			System.out.println(l+" for "+c.length+" Client full name: "+c[i].qetNickName()+" "+c[i].qetName()+" "+c[i].qetSerName()+", sex:"+c[i].qetSex()+
					", full date of birth:"+c[i].qetDay()+
					"."+c[i].qetMonth()+"."+c[i].qetYear()+"year, number room: "+c[i].qetNum()+", Telefon"+c[i].qetTel());
		}
		}
	}
	public void findMen(){
		String a = "men";
		for(int i=0; i < c.length;i++){
			if(c[i]!=null){
				if(a.equals(c[i].qetSex())){
					System.out.println(" Client full name: "+c[i].qetNickName()+" "+c[i].qetName()+" "+c[i].qetSerName()+", sex:"+c[i].qetSex()+
							", full date of birth:"+c[i].qetDay()+
							"."+c[i].qetMonth()+"."+c[i].qetYear()+"year, number room: "+c[i].qetNum()+", Telefon"+c[i].qetTel());
				}
			}
		}
		
	}
	public void findWomen(){
		String a = "women";
		for(int i=0; i < c.length;i++){
			if(c[i]!=null){
				if(a.equals(c[i].qetSex())){
					System.out.println(" Client full name: "+c[i].qetNickName()+" "+c[i].qetName()+" "+c[i].qetSerName()+", sex:"+c[i].qetSex()+
							", full date of birth:"+c[i].qetDay()+
							"."+c[i].qetMonth()+"."+c[i].qetYear()+"year, number room: "+c[i].qetNum()+", Telefon"+c[i].qetTel());
				}
			}
		}
		
	}
	public void findOld(int a){
		for(int i =0;i < c.length;i++){
			if(c[i]!=null){
				if(a<c[i].qetYear()){
					System.out.println(" Client full name: "+c[i].qetNickName()+" "+c[i].qetName()+" "+c[i].qetSerName()+", sex:"+c[i].qetSex()+
							", full date of birth:"+c[i].qetDay()+
							"."+c[i].qetMonth()+"."+c[i].qetYear()+"year, number room: "+c[i].qetNum()+", Telefon"+c[i].qetTel());
					
				}
			}
		}
	}
	
	
}
