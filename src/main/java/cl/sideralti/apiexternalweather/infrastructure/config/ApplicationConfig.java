package cl.sideralti.apiexternalweather.infrastructure.config;

import cl.sideralti.apiexternalweather.application.services.TaskService;
import cl.sideralti.apiexternalweather.application.usecases.*;
import cl.sideralti.apiexternalweather.domain.ports.in.GetAdditionalTaskInfoUseCase;
import cl.sideralti.apiexternalweather.domain.ports.out.ExternalServicePort;
import cl.sideralti.apiexternalweather.domain.ports.out.TaskRepositoryPort;
import cl.sideralti.apiexternalweather.infrastructure.adapters.ExternalServiceAdapter;
import cl.sideralti.apiexternalweather.infrastructure.repositories.JpaTaskRepository;
import cl.sideralti.apiexternalweather.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }


}
