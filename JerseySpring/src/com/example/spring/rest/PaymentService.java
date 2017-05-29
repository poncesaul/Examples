package com.example.spring.rest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring.model.Person;
import com.example.spring.transaction.TransactionBO;

@Component
@Path("/payment")
public class PaymentService {
	
	 private static final String txt = "Message from Server :\n%s";
	
	@Autowired
	TransactionBO transactionBO;
	
	@GET
	@Path("/test")
	public Response savePayment(){
		
		String result = transactionBO.save();
		
		return Response.status(200).entity(result).build();		
	}
	
	@POST
	@Path("/register")
	public Response addPerson(@Valid @RequestBody Person person){
		
		String response = String.format(txt,person);
	
		return Response.status(Response.Status.OK).entity(Person.class).build();
	}
	
	@POST
	public void savePerson(@Valid Person person){;
		System.out.println("Got :" + person);
	}
	
	/*@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Person savePerson(@Valid @RequestBody Person person){;
		return person;
	}*/
}
