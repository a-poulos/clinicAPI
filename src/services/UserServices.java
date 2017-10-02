package user;
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
import java.sql.Date;

import javax.naming.NamingException;
import java.util.ArrayList;
import com.google.gson.Gson;

public class UserServices {

//	@Path("/users")
	@GET
	@Produces("text/plain")
	public Response getUsers() throws NamingException, SQLException, ClassNotFoundException {
		
		UserFacade iFacade = UserFacade.getInstance();
		
		ArrayList<User> resultArray = iFacade.getUsers();
		
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
	
	@Path("users/user")
	@GET
	@Produces("text/plain")
	public Response getUserByUsernameName(@QueryParam("username") String username) throws NamingException, SQLException, ClassNotFoundException {
		
		UserFacade iFacade = UserFacade.getInstance();
		
		ArrayList<User> resultArray = iFacade.getUserByUsername(username);
		
		if(resultArray != null) {
			Gson theGsonObj = new Gson();
			String result = theGsonObj.toJson(resultArray);
			
			ResponseBuilder rb = Response.ok(result, MediaType.TEXT_PLAIN);
			rb.status(200);
			return rb.build();		
		}
		else {
			return Response.status(700).build();
		}
		
	}
	@Path("users/create")
	@POST
	@Produces("text/plain")
	@Consumes("application/x-www-form-urlencoded")
	public Response createUser(MultivaluedMap<String, String> formFields) throws NamingException, SQLException, ClassNotFoundException {
		
		UserFacade iFacade = UserFacade.getInstance();
		String fName = formFields.getFirst("fName");
		String lName = formFields.getFirst("lName");
		String username = formFields.getFirst("username");
		String password = formFields.getFirst("password");
		
		User user = new User(fName, lName, username, password);
		
		ArrayList<User> resultArray = iFacade.createUser(user);
		
		if(resultArray != null) {
			Gson theGsonObj = new Gson();
			String result = theGsonObj.toJson(resultArray);
			
			ResponseBuilder rb = Response.ok(result, MediaType.TEXT_PLAIN);
			rb.status(201);
			return rb.build();
		}
		else {
			return Response.status(700).build();
		}
		
	}

	
	
	
	
	
	
	
	



}
