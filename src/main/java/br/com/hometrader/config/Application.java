package br.com.hometrader.config;

import java.util.HashSet;
import java.util.Set;

import br.com.hometrader.example.ExampleRS;

public class Application extends javax.ws.rs.core.Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ExampleRS.class);

		return classes;
	}
}
