package com.hope.validation;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data // Lombok annotation for getters, setters, constructors, etc.
public class EmailValidationRequest {
    @JsonSerialize(using = ToStringSerializer.class)
    @MongoId(FieldType.OBJECT_ID)
    private String email;
}
