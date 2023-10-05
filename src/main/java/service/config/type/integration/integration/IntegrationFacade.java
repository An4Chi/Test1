package service.config.type.integration.integration;

import common.BaseFacade;
import common.ObjectMapperConfiguration;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class IntegrationFacade {
    @Resource
    private final BaseFacade baseFacade;
    @Resource
    private final ObjectMapperConfiguration objectMapperConfiguration;
    @Resource
    private final IntegrationConfiguration integrationConfiguration;

    public IntegrationFacade(BaseFacade baseFacade, ObjectMapperConfiguration objectMapperConfiguration, IntegrationConfiguration integrationConfiguration) {
        this.baseFacade = baseFacade;
        this.objectMapperConfiguration = objectMapperConfiguration;
        this.integrationConfiguration = integrationConfiguration;
    }
}
