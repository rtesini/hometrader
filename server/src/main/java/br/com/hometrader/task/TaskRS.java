package br.com.hometrader.task;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/tasks")
public class TaskRS {

	@GET
	@Path("")
	public Response get() {
		final List<Task> ex = new TaskService().getAll();
		return Response.ok(new Gson().toJson(ex), "application/json").build();
	}

	@POST
	@Path("")
	public Response post(@FormParam("task") String task) {
		Task t = new Gson().fromJson(task, Task.class);
		new TaskService().createNew(t);
		return Response.ok().build();
	}

}
