package service.config.type.integration.connection;

import common.BaseFacade;
import common.ObjectMapperConfiguration;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ConnectionFacade {
    @Resource
    private final BaseFacade baseFacade;
    @Resource
    private final ObjectMapperConfiguration objectMapperConfiguration;
    @Resource
    private final ConnectionConfiguration connectionConfiguration;

    public ConnectionFacade(BaseFacade baseFacade, ObjectMapperConfiguration objectMapperConfiguration, ConnectionConfiguration connectionConfiguration) {
        this.baseFacade = baseFacade;
        this.objectMapperConfiguration = objectMapperConfiguration;
        this.connectionConfiguration = connectionConfiguration;
    }
}
