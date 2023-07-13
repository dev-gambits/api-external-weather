package cl.sideralti.apiexternalweather.domain.ports.in;

import cl.sideralti.apiexternalweather.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
