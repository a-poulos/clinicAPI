package patient;
import java.util.ArrayList;
import java.sql.Date;

public class Patient {
	
	private int pt_id;
	private String fName;
	private String mName;
	private String lName;
	private Date bDay;
	private Date dDay = null;
	private String gender;
	private int providerID;
	private static ArrayList<Patient> patientList;
	
	Patient(int id, String fName, String mName, String lName, Date bDay, Date dDay, String gender, int providerID) {
		this.pt_id = id;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName; 
		this.bDay = bDay;
		this.dDay = dDay;
		this.gender = gender;
		this.providerID = providerID;
		Patient.patientList.add(this); 
		
	}
			
			
	Patient(String fName, String mName, String lName, Date dob, String gender, int providerID) {
		
		pt_id = generateID();
		//check to make sure there are no empty strings...
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.bDay = dob;
		this.gender = gender;
		this.providerID = providerID;		
	}	

	String getGender() {
		return this.gender;
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}


	Date getdDay() {
		//check to see if patient is actually dead
		return this.dDay;
	}
	
	void setdDay(Date dDay) {
		this.dDay = dDay;
	}
	
	Date getbDay() {
		return this.bDay;
	}
	
	void setbDay(Date bDay) {
		this.bDay = bDay;
	}
	
	int generateID() {		
		int newID = 0; 
		//insert some hash function here
		return newID;
	}
	
	
	int getID() {
		return this.pt_id;	
	}
	
	String getfName() {
		return this.fName;
	}
	
	void setfName(String fName) {
		this.fName = fName;
	}
	
	String getlName() {
		return this.lName;
	}
	
	void setlName(String lName) {
		this.lName = lName;
	}
	
	String getmName() {
		return this.mName;
	}
	
	void setmName(String mName) {
		this.mName = mName;
	}
	
	int getProviderID() {
		//the last provider in the ArrayList is the current provider
		//make a different class for doctor to add start and stop dates for patients?			
		return this.providerID;
	}
	
/*
	void setProvider(Provider provider) {
		//if != null, ask for start date of new doctor and calculate 
		//stop date of old doctor. Also remove patient from provider 
		//active patient list with a stop date
	
	}
*/

	ArrayList<Patient> getList() {
		return patientList;
	}
		
	
}
