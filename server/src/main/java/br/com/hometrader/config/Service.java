package br.com.hometrader.config;

public class Service {

	public  <T extends BaseRepository> T repo(Class<T> clazz) {
		return Repository.invoke(clazz);
	}

}
