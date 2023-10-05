package IntegrationManagerTests.inbound;

import service.inbound.entity.*;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InboundTestsHandler {
    public static InboundEntity createBaseInboundObject(@Nullable UUID referenceID, @Nullable InboundAction inboundAction, @Nullable InboundEntityType inboundEntityType, @Nullable String typeName, @Nullable ProjectStatus projectStatus, @Nullable Map<String, Object> fields) {
        InboundEntity inboundObject = new InboundEntity();
        inboundObject.setReferenceId(referenceID.toString());
        inboundObject.setAction(inboundAction);
        inboundObject.setEntityType(inboundEntityType);
        inboundObject.setTypeName(typeName);
        inboundObject.setStatus(projectStatus);
        inboundObject.setFields(fields);
        return inboundObject;
    }

    public static InboundRequestEntity createBaseInboundRequest(@Nullable List<InboundEntity> inboundEntityList, @Nullable String integrationName, @Nullable String endpointAlias) {
        InboundRequestEntity inboundRequest = new InboundRequestEntity();
        inboundRequest.setObjects(inboundEntityList);
        inboundRequest.setIntegrationName(integrationName);
        inboundRequest.setEndpointAlias(endpointAlias);
        return inboundRequest;

    }
}
