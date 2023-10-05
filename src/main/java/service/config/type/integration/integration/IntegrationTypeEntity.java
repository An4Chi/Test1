package service.config.type.integration.integration;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.locusview.platform.common.LocalDateTimeDeserializer;
import io.locusview.platform.common.LocalDateTimeSerializer;

import java.time.LocalDateTime;

public class IntegrationTypeEntity {
    private Long id;
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
    private String name;
    private String description;
    private Long connectionId;

    public IntegrationTypeEntity(Long id, LocalDateTime createDate, LocalDateTime lastUpdated, String name, String description, Long connectionId) {
        this.id = id;
        this.createDate = createDate;
        this.lastUpdated = lastUpdated;
        this.name = name;
        this.description = description;
        this.connectionId = connectionId;
    }

    public IntegrationTypeEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
    }
}
