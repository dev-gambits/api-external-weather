package cl.sideralti.apiexternalweather.domain.ports.in;

import cl.sideralti.apiexternalweather.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
}
