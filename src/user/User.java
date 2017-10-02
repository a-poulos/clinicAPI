package user;
import java.util.ArrayList;
import java.sql.Date;

public class User {

	private int user_id;
	private String fName;
	private String lName;
	private String mName;
	private Date birth;
	private String credentials;
	private String licenseNum;
	private final String username;
	private String password; //has this
	private static ArrayList<User> userList;
	
	User(String fName, String lName, String username, String password) {
		 this.fName = fName;
		 this.lName = lName;
		 this.username = username;
		 this.password = password;
		 
	}
	
	User(int user_id, String fName, String lName, String username, String password) {
		this.user_id = user_id;
		this.fName = fName;
		this.lName = lName;
		this.username = username;
		this.password = password;
	}
	
	int getUserID() {
		return this.user_id;
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
	
	String getUsername() {
		return this.username;
	}
	
	String getPassword() {
		return this.password;
	}
	
	void setPassword(String password) {
		this.password = password;
	}
	
	Date getBDay() {
		return this.birth;
	}
	
	void setBDay(Date bDay) {
		this.birth = bDay;
	}
	
	String getCredentials() {
		return this.credentials;
	}
	
	void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	
	String getLicense() {
		return this.licenseNum;
	}
	
	void setLicense(String license) {
		//make sure credentials are set as well 
		//if entering a license
		
		this.licenseNum = license;
	}
	
	
	
	
	
}
