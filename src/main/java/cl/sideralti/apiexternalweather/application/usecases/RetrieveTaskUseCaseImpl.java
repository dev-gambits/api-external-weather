package cl.sideralti.apiexternalweather.application.usecases;

import cl.sideralti.apiexternalweather.domain.model.Task;
import cl.sideralti.apiexternalweather.domain.ports.in.RetrieveTaskUseCase;
import cl.sideralti.apiexternalweather.domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }
}
