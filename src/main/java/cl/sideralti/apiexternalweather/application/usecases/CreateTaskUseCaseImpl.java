package cl.sideralti.apiexternalweather.application.usecases;

import cl.sideralti.apiexternalweather.domain.model.Task;
import cl.sideralti.apiexternalweather.domain.ports.in.CreateTaskUseCase;
import cl.sideralti.apiexternalweather.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
