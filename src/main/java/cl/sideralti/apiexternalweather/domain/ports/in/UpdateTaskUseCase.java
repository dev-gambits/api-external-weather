package cl.sideralti.apiexternalweather.domain.ports.in;

import cl.sideralti.apiexternalweather.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTasks(Long id, Task updatedTasks);
}
