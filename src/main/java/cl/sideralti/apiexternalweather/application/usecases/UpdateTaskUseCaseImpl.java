package cl.sideralti.apiexternalweather.application.usecases;

import cl.sideralti.apiexternalweather.domain.model.Task;
import cl.sideralti.apiexternalweather.domain.ports.in.UpdateTaskUseCase;
import cl.sideralti.apiexternalweather.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTasks(Long id, Task updatedTasks) {
        return Optional.empty();
    }
}
