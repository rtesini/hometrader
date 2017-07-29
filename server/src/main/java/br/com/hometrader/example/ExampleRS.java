package br.com.hometrader.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/example")
public class ExampleRS {

	@GET
	@Path("/all")
	public Response get() {
		// final List<ExampleEntity> ex = new ExampleService().get();
		final List<ExampleEntity> ex = new ArrayList<>();
		return Response.ok(new Gson().toJson(ex), "application/json").build();
	}

}
