package com.hope.validation;

import lombok.Data;

@Data
public class EventValidationRequest {
    private String eventName;
    private String eventDate; // Format: YYYY-MM-DD
    private String location;
}
