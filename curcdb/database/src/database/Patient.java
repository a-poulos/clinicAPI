package database;
import java.util.ArrayList;
import java.util.Date;

public class Patient {
	
	private int pt_id;
	private Date bDay;
	private Date dDay = null;
	private String fName;
	private String mName;
	private String lName;
	private char gender;
	private Physician physician;
	private ArrayList<Study> studies;
	//inherit PatientManager patientList
	
	private Patient(String fName, String mName, String lName, Date dob, char gender, Physician physician) {
		
		pt_id = generateID();
		//add Patient object to PatientManager at the end
		//check to make sure there are no empty strings...
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.bDay = dob;
		this.gender = gender;
		this.physician = physician;
		
	}	

	private char getGender() {
		return this.gender;
	}
	
	private void setGender(char gender) {
		this.gender = gender;
	}


	private Date getdDay() {
		//check to see if patient is actually dead
		return this.dDay;
	}
	
	private void setdDay(Date dDay) {
		this.dDay = dDay;
	}
	
	private Date getbDay() {
		return this.bDay;
	}
	
	private void setbDay(Date bDay) {
		this.bDay = bDay;
	}
	
	private int generateID() {		
		int newID = 0; 
		//insert some hash function here
		return newID;
	}
	
	
	private int getID() {
		return this.pt_id;	
	}
	
	private String getfName() {
		return this.fName;
	}
	
	private void setfName(String fName) {
		this.fName = fName;
	}
	
	private String getlName() {
		return this.lName;
	}
	
	private void setlName(String lName) {
		this.lName = lName;
	}
	
	private Physician getPhysician() {
		//the last physician in the ArrayList is the current physician
		//make a different class for doctor to add start and stop dates for patients?			
		return this.physician;
	}
	
	private void setPhysician(Physician physician) {
		//if != null, ask for start date of new doctor and calculate 
		//stop date of old doctor. Also remove patient from physician 
		//active patient list with a stop date
		this.physician = physician;

	}
	
	private void addStudy(Study study) {
		//call this from the PatientManager
		
	}
	
	private void removeStudy(int studyID) {
		//make sure there is a study to remove first in StudyManager
		//call this from the PatientManager
	}
	
}
