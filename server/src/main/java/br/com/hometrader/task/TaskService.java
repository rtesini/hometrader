package br.com.hometrader.task;

import java.util.List;

import br.com.hometrader.config.Service;

public class TaskService extends Service {

	public List<Task> getAll() {
		return repo(TaskRepository.class).get();
	}

	public void createNew(Task t) {
		repo(TaskRepository.class).create(t);
	}
}
