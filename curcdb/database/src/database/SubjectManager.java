package database;
import java.util.ArrayList;

public class SubjectManager {
	
	private ArrayList<Subject> subjectList;

	private SubjectManager() {
		
	}
	
	private void addSubject(Subject sub) {
		
		subjectList.add(sub);
		
	}
	
}
