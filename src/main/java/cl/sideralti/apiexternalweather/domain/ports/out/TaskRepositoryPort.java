package cl.sideralti.apiexternalweather.domain.ports.out;

import cl.sideralti.apiexternalweather.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
