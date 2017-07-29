package br.com.hometrader.config;

import java.util.HashSet;
import java.util.Set;

import br.com.hometrader.example.ExampleRS;
import br.com.hometrader.task.TaskRS;

public class Application extends javax.ws.rs.core.Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ExampleRS.class);
		classes.add(TaskRS.class);

		return classes;
	}
}
