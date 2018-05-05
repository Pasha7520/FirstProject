package library;

public class Department implements Print {
	private int numRack ;
	private int numCleaner;
	private int numLibrarian;
	private Rack [] racks;
	private Cleaner [] cleaners;
	private Librarian [] librarians;
	private DepartmentHead DH;
	
		Department(int numRack,int numCleaner,int numLibrarian){
			this.numRack=numRack;
			this.numCleaner=numCleaner;
			this.numLibrarian=numLibrarian;
		
			racks = new Rack [numRack];
			cleaners = new Cleaner [numCleaner];
			librarians = new Librarian [numLibrarian];
		}
		public void setNumRack(int numRack){
			this.numRack=numRack;
		}
		public void setNumCleaner(int numCleaner){
			this.numCleaner=numCleaner;
		}
		public void setNumLibrarian(int numLibrarian){
			this.numLibrarian=numLibrarian;
		}
		public int qetNumRack(){
			return numRack;
		}
		public int qetNumLibrarian(){
			return numLibrarian;
		}
		public int qetNumCleaner(){
			return numCleaner;
		}
		public void setRack(Rack rack){
			for(int i=0;i < numRack;i++){
				if(racks[i]==null){
					racks[i]=rack;
					break;
				}
			}
		}
		public void addCleaner(Cleaner cleaner){
			for(int i=0;i < numCleaner;i++){
				if(cleaners[i]==null){
					cleaners[i]=cleaner;
					break;
					}
				}
		}
		public void addLibrarian(Librarian librarian){
			for(int i=0;i < numCleaner;i++){
				if(librarians[i]==null){
					librarians[i]=librarian;
					break;
					}
				}
		}
		public Rack qetRack(int a){
			return racks[a];
		}
		public Cleaner qetCleaner(int a){
			return cleaners[a];
		}
		public Librarian qetLibrarian(int a){
			return librarians[a];
		}
		@Override
		public void prints() {
			System.out.println("Department have "+ numRack+" racks and "+numCleaner+" Cleaner and "+numLibrarian+"Librarian");
			System.out.println("rack have next option");
			for(int i=0;i < numRack;i++){
				System.out.println(racks[i]);
			}
			System.out.println("Cleaner - ");
			for(int i=0;i<numCleaner;i++){
				System.out.println(cleaners[i]);
			}
			System.out.println("Librarian - ");
			for(int i=0;i<numLibrarian;i++){
				System.out.println(librarians[i]);
			}
		}
		
}