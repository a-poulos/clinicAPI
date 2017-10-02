package provider;
import java.util.ArrayList;

public class Provider {
	
	private static ArrayList<Provider> providerList;
	private int providerID;
	private String fName;
	private String lName;
	private String credentials;
	private String licenseNum;
	private String npi;
	
	private Provider(int providerID, String fName, String lName, String credentials, String licenseNum, String npi) {
		this.providerID = providerID;
		this.fName = fName;
		this.lName = lName;
		this.credentials = credentials;
		this.licenseNum = licenseNum;
		this.npi = npi;
		
	}
	
	private Provider(int providerID, String fName, String lName, String credentials) {
		this.providerID = providerID;
		this.fName = fName;
		this.lName = lName;
		this.credentials = credentials;
		
	}
	
	String getLName() {
		return this.lName;
	}
	
	//add function to get provider from providerList by ID
}
