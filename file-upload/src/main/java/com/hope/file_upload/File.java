package com.hope.file_upload;

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
@Data
@Document(collection = "file")
public class File {
    @JsonSerialize(using = ToStringSerializer.class)
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String fileName;
    private String fileType;
    private byte[] data;
}

