package com.hope.validation;

import lombok.Data;

@Data // Lombok annotation for getters, setters, constructors, etc.
public class EmailValidationRequest {
    private String email;
}
