package service.config.type.integration.integration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nortecview.config.conditiontype.entity.ConditionType;
import com.nortecview.config.integration.entity.SourceEntityType;
import com.nortecview.config.integration.field.FieldMapping;
import io.locusview.platform.common.LocalDateTimeDeserializer;
import io.locusview.platform.common.LocalDateTimeSerializer;

import java.time.LocalDateTime;
import java.util.List;

public class EntityMappingType {
    private Long id;
    private Long integrationFlowId;
    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    private LocalDateTime createDate;
    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    private LocalDateTime lastUpdated;
    private String description;
    private SourceEntityType sourceEntityType;
    private Long sourceEntityTypeId;
    private Long endpointId;
    private String targetEntity;
    private ConditionType conditionType;
    private List<FieldMapping> fieldsMapping;
    private int order;
    @JsonIgnore
    private boolean deleted;

    public EntityMappingType(Long id, Long integrationFlowId, LocalDateTime createDate, LocalDateTime lastUpdated, String description, SourceEntityType sourceEntityType, Long sourceEntityTypeId, Long endpointId, String targetEntity, ConditionType conditionType, List<FieldMapping> fieldsMapping, int order, boolean deleted) {
        this.id = id;
        this.integrationFlowId = integrationFlowId;
        this.createDate = createDate;
        this.lastUpdated = lastUpdated;
        this.description = description;
        this.sourceEntityType = sourceEntityType;
        this.sourceEntityTypeId = sourceEntityTypeId;
        this.endpointId = endpointId;
        this.targetEntity = targetEntity;
        this.conditionType = conditionType;
        this.fieldsMapping = fieldsMapping;
        this.order = order;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIntegrationFlowId() {
        return integrationFlowId;
    }

    public void setIntegrationFlowId(Long integrationFlowId) {
        this.integrationFlowId = integrationFlowId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SourceEntityType getSourceEntityType() {
        return sourceEntityType;
    }

    public void setSourceEntityType(SourceEntityType sourceEntityType) {
        this.sourceEntityType = sourceEntityType;
    }

    public Long getSourceEntityTypeId() {
        return sourceEntityTypeId;
    }

    public void setSourceEntityTypeId(Long sourceEntityTypeId) {
        this.sourceEntityTypeId = sourceEntityTypeId;
    }

    public Long getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Long endpointId) {
        this.endpointId = endpointId;
    }

    public String getTargetEntity() {
        return targetEntity;
    }

    public void setTargetEntity(String targetEntity) {
        this.targetEntity = targetEntity;
    }

    public ConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(ConditionType conditionType) {
        this.conditionType = conditionType;
    }

    public List<FieldMapping> getFieldsMapping() {
        return fieldsMapping;
    }

    public void setFieldsMapping(List<FieldMapping> fieldsMapping) {
        this.fieldsMapping = fieldsMapping;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
