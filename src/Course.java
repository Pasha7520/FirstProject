
public class Course {
	private Person peoples[] = new Person [30];
		private int kls = 0;
		public boolean addPeople(Person people){
			if(kls<29){
				peoples[kls]=people;
				kls++;
				return true;
			}
			return false;
		}
		public boolean removePeople(Person people){
			if(kls<=0){
				peoples[kls]=people;
				kls--;
				return true;
			}
			return false;
		}
		public void setKls(int kls){
			this.kls=kls;
		}
		public int qetkls(){
			return kls;
		}
		public void printPeoples(){
			for(int i = 0;i < kls;i++){
				peoples[i].printName();
			}
		}

}
