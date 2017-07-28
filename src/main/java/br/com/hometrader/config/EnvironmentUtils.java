package br.com.hometrader.config;

import com.google.appengine.api.utils.SystemProperty;

public class EnvironmentUtils {

	public static boolean isAutomatedTest() {
		final String test = System.getProperty("automatedTest");
		return (test != null && test.equals("true"));
	}

	public static boolean isProduction() {//TODO refatorar e colocar logicas dos ambientes criados (prod, QA, DEV)
		return SystemProperty.environment.value() == SystemProperty.Environment.Value.Production;
	}
}
