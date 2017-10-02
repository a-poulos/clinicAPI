package patient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.naming.NamingException;

import java.util.ArrayList;
import java.util.Arrays;
import com.google.gson.Gson;

@Path("")
public class PatientServices {

	@Path("/patients")
	@GET
	@Produces
	public Response getPatients() throws NamingException, SQLException, ClassNotFoundException {
		
		PatientFacade iFacade = PatientFacade.getInstance();
		
		ArrayList<Patient> resultArray = iFacade.getPatients();
		
		if(resultArray != null) {
			Gson gsonObj = new Gson();
			String result = gsonObj.toJson(resultArray);
			
			ResponseBuilder rb = Response.ok(result, MediaType.TEXT_PLAIN);
			rb.status(200);
			return rb.build();
		}
		else {
			return Response.status(700).build();
		}
		
	}

	public Response getPatientByName(@QueryParam("fName") String fName, @QueryParam("lName") String lName) throws NamingException, SQLException, ClassNotFoundException {
		PatientFacade iFacade = PatientFacade.getInstance();
		ArrayList<Patient> resultArray = iFacade.getPatientByName(fName, lName);
		
		if(resultArray != null) {
			Gson gsonObj = new Gson();
			String result = gsonObj.toJson(resultArray);
			
			ResponseBuilder rb = Response.ok(result, MediaType.TEXT_PLAIN);
			rb.status(200);
			return rb.build();
		}
		else {
			return Response.status(700).build();
		}
	}

}
