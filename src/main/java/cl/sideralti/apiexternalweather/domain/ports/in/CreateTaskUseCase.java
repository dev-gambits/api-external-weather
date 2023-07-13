package cl.sideralti.apiexternalweather.domain.ports.in;

import cl.sideralti.apiexternalweather.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
