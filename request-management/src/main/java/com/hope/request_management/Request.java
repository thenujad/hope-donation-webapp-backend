package com.hope.request_management;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "requests")
public class Request {

    private String id;
    private String userId;
    private String description;
    private String status;
}
