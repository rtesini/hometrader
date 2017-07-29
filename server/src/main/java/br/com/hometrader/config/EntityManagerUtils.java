package br.com.hometrader.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {

	protected static final String PERSISTENCE_UNIT = "xm_dbase";
	private static EntityManagerFactory emf;

	public static void initialize() {
		Map<String, String> properties = new HashMap<String, String>();
		if (EnvironmentUtils.isProduction()) {
			properties.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.GoogleDriver");
			properties.put("javax.persistence.jdbc.url", System.getProperty("cloudsql.url"));
		} else {
			properties.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
			properties.put("javax.persistence.jdbc.url", System.getProperty("cloudsql.url.dev"));
		}

		emf = Persistence.createEntityManagerFactory(EntityManagerUtils.PERSISTENCE_UNIT, properties);
	}

	protected static EntityManager createEntityManager() {
		if (emf != null && emf.isOpen()) {
			return emf.createEntityManager();
		}
		return null;
	}
}
