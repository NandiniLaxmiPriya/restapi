package com.query.googlie;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/info")
public class QueryRes {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDetails(@QueryParam("rno1") String rno1,@QueryParam("rno2") String rno2)
	{
		return "Welcome "+rno1+" "+rno2;
	}
}