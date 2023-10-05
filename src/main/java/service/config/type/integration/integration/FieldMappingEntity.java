package service.config.type.integration.integration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nortecview.config.conditiontype.entity.ConditionType;
import com.nortecview.config.integration.entity.FieldMappingType;
import com.nortecview.config.integration.entity.FieldSource;
import com.nortecview.config.integration.entity.FieldTransformationType;
import io.locusview.platform.common.LocalDateTimeDeserializer;
import io.locusview.platform.common.LocalDateTimeSerializer;

import java.time.LocalDateTime;

public class FieldMappingEntity {
    private Long id;
    private Long entityMappingId;
    private Long integrationFlowId;
    private FieldMappingType fieldMappingType;
    private FieldSource fieldSource;
    private Long fieldSourceTypeId;
    private Long sourceFieldId;
    private String sourceFieldKey;
    private String targetFieldKey;
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
    private int order;
    private FieldTransformationType transformationType;
    private Long transformationTypeId;
    private String transformationContext;
    @JsonIgnore
    private boolean deleted;
    private ConditionType conditionType;

    public FieldMappingEntity(Long id, Long entityMappingId, Long integrationFlowId, FieldMappingType fieldMappingType, FieldSource fieldSource, Long fieldSourceTypeId, Long sourceFieldId, String sourceFieldKey, String targetFieldKey, LocalDateTime createDate, LocalDateTime lastUpdated, int order, FieldTransformationType transformationType, Long transformationTypeId, String transformationContext, boolean deleted, ConditionType conditionType) {
        this.id = id;
        this.entityMappingId = entityMappingId;
        this.integrationFlowId = integrationFlowId;
        this.fieldMappingType = fieldMappingType;
        this.fieldSource = fieldSource;
        this.fieldSourceTypeId = fieldSourceTypeId;
        this.sourceFieldId = sourceFieldId;
        this.sourceFieldKey = sourceFieldKey;
        this.targetFieldKey = targetFieldKey;
        this.createDate = createDate;
        this.lastUpdated = lastUpdated;
        this.order = order;
        this.transformationType = transformationType;
        this.transformationTypeId = transformationTypeId;
        this.transformationContext = transformationContext;
        this.deleted = deleted;
        this.conditionType = conditionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEntityMappingId() {
        return entityMappingId;
    }

    public void setEntityMappingId(Long entityMappingId) {
        this.entityMappingId = entityMappingId;
    }

    public Long getIntegrationFlowId() {
        return integrationFlowId;
    }

    public void setIntegrationFlowId(Long integrationFlowId) {
        this.integrationFlowId = integrationFlowId;
    }

    public FieldMappingType getFieldMappingType() {
        return fieldMappingType;
    }

    public void setFieldMappingType(FieldMappingType fieldMappingType) {
        this.fieldMappingType = fieldMappingType;
    }

    public FieldSource getFieldSource() {
        return fieldSource;
    }

    public void setFieldSource(FieldSource fieldSource) {
        this.fieldSource = fieldSource;
    }

    public Long getFieldSourceTypeId() {
        return fieldSourceTypeId;
    }

    public void setFieldSourceTypeId(Long fieldSourceTypeId) {
        this.fieldSourceTypeId = fieldSourceTypeId;
    }

    public Long getSourceFieldId() {
        return sourceFieldId;
    }

    public void setSourceFieldId(Long sourceFieldId) {
        this.sourceFieldId = sourceFieldId;
    }

    public String getSourceFieldKey() {
        return sourceFieldKey;
    }

    public void setSourceFieldKey(String sourceFieldKey) {
        this.sourceFieldKey = sourceFieldKey;
    }

    public String getTargetFieldKey() {
        return targetFieldKey;
    }

    public void setTargetFieldKey(String targetFieldKey) {
        this.targetFieldKey = targetFieldKey;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public FieldTransformationType getTransformationType() {
        return transformationType;
    }

    public void setTransformationType(FieldTransformationType transformationType) {
        this.transformationType = transformationType;
    }

    public Long getTransformationTypeId() {
        return transformationTypeId;
    }

    public void setTransformationTypeId(Long transformationTypeId) {
        this.transformationTypeId = transformationTypeId;
    }

    public String getTransformationContext() {
        return transformationContext;
    }

    public void setTransformationContext(String transformationContext) {
        this.transformationContext = transformationContext;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public ConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(ConditionType conditionType) {
        this.conditionType = conditionType;
    }
}
