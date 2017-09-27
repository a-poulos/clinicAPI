package database;
import java.util.ArrayList;

public class PatientManager {
	
	private ArrayList<Patient> patientList;


	private PatientManager() {
		
		//create PatientManager object
		
	}
	
	private void addPatient(Patient patient) {
		
		patientList.add(patient);
	
	}

}