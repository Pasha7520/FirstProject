package Man;

public class Train {
	private Wagon [] wagon ;
	private int w;
			Train(int a){
				this.w=a;
				wagon = new Wagon [a];
				for(int i=0;i < w;i++){
					wagon[i] = new Wagon();
				}
			
			}
	public void setCost(int a){
		
	}
	public void takePlace(Person person){
		boolean a = false;
		for(int i = 0;i < w;i++){
			
			a = wagon[i].takePlase(person);
			
			if(a == true){
				System.out.print("Wagon-"+(i+1)+",place"+(wagon[i].qetQ()+1)+"price ticket");
				wagon[i].print(wagon[i].qetQ());
				break;
			}
			
		}

	}
}
