package database;
import java.util.ArrayList;

public class PhysicianManager {

	private ArrayList<Physician> physicianList;
	
	public PhysicianManager() {
		
	}
	
	public void addPhysician(Physician doctor) {
		physicianList.add(doctor);
	}
	
	
}
