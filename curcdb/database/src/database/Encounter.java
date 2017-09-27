package database;
import java.util.Date;

public class Encounter {
	
	private final int encounterID;
	private final String subjectID;
	private final int visitID;
	private Date DOS;
	private boolean isPaid;
	private double paidAmount;
	
	public Encounter(int encounterID, String subjectID, int visitID, Date DOS) {
	
		this.encounterID = encounterID;
		this.subjectID = subjectID;
		this.visitID = visitID;
		this.DOS = DOS;
		isPaid = false;
		paidAmount = 0;
	}
	
	private int getEncounterID() {
		return encounterID;
	}
	
	private String getSubject() {
		return subjectID;
	}
	
	private int visitID() {
		return visitID;
	}
	

}
