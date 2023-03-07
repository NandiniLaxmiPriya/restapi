package com.hello.prome;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/{messageId}")
public class HeloResource {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(@PathParam("messageId") String messageId)
	{
		return "Hello "+messageId;
	}

}
