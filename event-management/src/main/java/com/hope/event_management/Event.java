package com.hope.event_management;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "events")
public class Event {
    @JsonSerialize(using = ToStringSerializer.class)
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String name;
    private String date;
    private String description;

}

