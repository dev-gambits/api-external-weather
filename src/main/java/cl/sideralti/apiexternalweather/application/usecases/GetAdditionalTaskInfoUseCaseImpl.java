package cl.sideralti.apiexternalweather.application.usecases;

import cl.sideralti.apiexternalweather.domain.model.AdditionalTaskInfo;
import cl.sideralti.apiexternalweather.domain.ports.in.GetAdditionalTaskInfoUseCase;
import cl.sideralti.apiexternalweather.domain.ports.out.ExternalServicePort;
import cl.sideralti.apiexternalweather.domain.ports.out.TaskRepositoryPort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
