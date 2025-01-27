package com.hope.user_management;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
@Data
public class User {
    @JsonSerialize(using = ToStringSerializer.class)
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String name;
    private String email;
    private String password;
}
