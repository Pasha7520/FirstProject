package build;

public class House extends Building {
	
	House(int floors,int numRooms,int totalArea){
		super(floors, numRooms, totalArea);
	}
	
	@Override
	public String toString() {
		return "� ������� � " + qetNumRooms() + " �������";
	}
}
