package cl.sideralti.apiexternalweather.domain.ports.out;

import cl.sideralti.apiexternalweather.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
