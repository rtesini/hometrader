package br.com.hometrader.task;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.hometrader.config.BaseRepository;

public class TaskRepository extends BaseRepository {

	public List<Task> get() {
		final TypedQuery<Task> query = em.createQuery("FROM Task c", Task.class);
		return query.getResultList();
	}

	public void create(Task t) {
		em.persist(t);
	}

}
