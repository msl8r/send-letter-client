package uk.gov.hmcts.reform.sendletter.api.model.v3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Letter {

    @JsonProperty("documents")
    public final List<Document> documents;

    @JsonProperty("type")
    public final String type;

    @JsonProperty("additional_data")
    public final Map<String, Object> additionalData;

    public Letter(
        String type,
        List<Document> documents,
        Map<String, Object> additionalData
    ) {
        this.type = type;
        this.documents = documents;
        this.additionalData = additionalData;
    }
}
