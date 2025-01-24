package com.hope.file_upload;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files")
@Data  // Lombok annotation to generate getters, setters, constructors, and toString method
public class File {

    private String id;
    private String fileName;
    private String fileType;
    private byte[] data;

}
