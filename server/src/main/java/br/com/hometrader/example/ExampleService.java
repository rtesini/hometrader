package br.com.hometrader.example;

import java.util.List;

import br.com.hometrader.config.Service;

public class ExampleService extends Service {

	public List<ExampleEntity> get() {
		return repo(ExampleRepository.class).get();
	}
}
