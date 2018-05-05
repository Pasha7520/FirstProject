package Man;

public class Wagon {
	private Person [] place ;
	private int price;
	private int q ;
			Wagon(){
				place = new Person[10];
			}
		public boolean takePlase(Person a){
			boolean b = false;
			for(int i=0;i < place.length;i++){
				if(place[i]==null){
				place[i]=a;
				b = true;
				q = i;
				return b;
					}
				}

			return b;
			}
		public int qetQ(){
			return q;
		}
		public void print(int e){
			
			place[e].print();
		
		}
		}

