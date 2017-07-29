package br.com.hometrader.config;

import javax.persistence.EntityManager;

public class BaseRepository {

	protected EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void begin() {
		em.getTransaction().begin();
	}

	public void commit() {
		em.getTransaction().commit();
	}

	public void close() {
		em.close();
	}

}
