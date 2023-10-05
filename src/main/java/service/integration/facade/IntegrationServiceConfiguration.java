package service.integration.facade;

import common.BaseFacade;
import common.ObjectMapperConfiguration;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegrationServiceConfiguration {
    @Resource
    private BaseFacade baseFacade;
    @Resource
    private ObjectMapperConfiguration objectMapperConfiguration;

    @Bean
    public IntegrationConfiguration inboundConfiguration() {
        return new IntegrationConfiguration();
    }

    @Bean
    public IntegrationFacade inboundFacade(final IntegrationConfiguration inboundConfiguration) {
        return new IntegrationFacade(baseFacade, objectMapperConfiguration, inboundConfiguration);
    }
}
