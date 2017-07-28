package br.com.hometrader.config;

public class Repository {

	public static <T extends BaseRepository> T invoke(Class<T> clazz) {
		try {
			T repo = clazz.newInstance();
			repo.setEm(TransactionalContext.getEntityManager());
			return repo;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
