package br.com.hometrader.example;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.hometrader.config.BaseRepository;

public class ExampleRepository extends BaseRepository {

	public List<ExampleEntity> get() {
		final TypedQuery<ExampleEntity> query = em.createQuery("FROM ExampleEntity c", ExampleEntity.class);
		return query.getResultList();
	}

}
