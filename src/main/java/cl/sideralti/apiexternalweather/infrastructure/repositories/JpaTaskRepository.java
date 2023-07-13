package cl.sideralti.apiexternalweather.infrastructure.repositories;

import cl.sideralti.apiexternalweather.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
