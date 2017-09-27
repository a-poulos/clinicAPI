package database;
import java.util.ArrayList;

public class EncounterManager {
	
	private ArrayList<Encounter> encounterList;
	
	public EncounterManager() {
		
	}
	
	public void addEncounter(Encounter visit) {
		encounterList.add(visit);
	}
	
	
}
