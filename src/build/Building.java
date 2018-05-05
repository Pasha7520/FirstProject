package build;

public abstract class Building  {
	private int floors;
	private int numRooms;
	private int totalArea;
	

	Building(int floors,int numRooms,int totalArea){
		this.floors=floors;
		this.numRooms=numRooms;
		this.totalArea=totalArea;
	}
	public void setFloors(int floors){
		this.floors=floors;
	}
	public int qetFloors(){
		return floors;
	}
	public void setNumRooms(int numRooms){
		this.numRooms=numRooms;
	}
	public int qetNumRooms(){
		return numRooms;
	}
	public void setTotalArea(int totalArea){
		this.totalArea=totalArea;
	}
	public int qetTotalArea(){
		return totalArea;
	}
}
