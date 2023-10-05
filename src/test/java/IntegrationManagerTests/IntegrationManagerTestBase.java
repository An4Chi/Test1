package IntegrationManagerTests;

import com.nortecview.config.integration.entity.FlowStatus;
import service.auth.AuthServiceConfiguration;
import service.auth.AuthServiceEntity;
import service.auth.AuthServiceFacade;
import common.BaseConfiguration;
import common.BaseFacadeEntity;
import common.BaseFacade;
import common.ObjectMapperConfiguration;
import service.config.ConfigServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import service.inbound.facade.InboundFacade;
import service.inbound.facade.InboundServiceConfiguration;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static org.testcontainers.shaded.org.awaitility.Awaitility.await;

@ContextConfiguration(classes = {BaseConfiguration.class, AuthServiceConfiguration.class, ConfigServiceConfiguration.class, InboundServiceConfiguration.class})
@TestComponent
@ComponentScan(basePackages = {"common", "service.auth", "service.config", "service.inbound"})
public class IntegrationManagerTestBase extends AbstractTestNGSpringContextTests {

    @Autowired
    protected ObjectMapperConfiguration objectMapperConfiguration;
    @Autowired
    private BaseFacadeEntity baseFacadeEntity;
    @Autowired
    private BaseFacade baseFacade;
    @Autowired
    private AuthServiceEntity authConfiguration;
    @Autowired
    private AuthServiceFacade authServiceFacade;
    @Autowired
    protected InboundFacade inboundFacade;

    public void setUp() {
        String token = authServiceFacade.authenticate().getToken();
        baseFacade.setTokenHeader(token);
    }

    protected void waitUntilInboundFlowDone(FlowStatus flowStatus, Long trackingId) {
        Callable<Boolean> statusResponsecallable = () -> {
            inboundFacade.triggerInboundJob();
            inboundFacade.triggerInboundJob();
            return inboundFacade.getInboundTrackingStatus(trackingId).getStatus().equals(flowStatus);
        };
        await().atMost(30, TimeUnit.SECONDS).until(statusResponsecallable);
    }
}
