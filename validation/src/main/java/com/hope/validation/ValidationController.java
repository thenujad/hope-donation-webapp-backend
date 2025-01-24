package com.hope.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validate")
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    // Validate email format and availability
    @PostMapping("/email")
    public ResponseEntity<String> validateEmail(@RequestBody EmailValidationRequest emailRequest) {
        String result = validationService.validateEmail(emailRequest.getEmail());
        return ResponseEntity.ok(result);
    }

    // Validate event details
    @PostMapping("/event")
    public ResponseEntity<String> validateEvent(@RequestBody EventValidationRequest eventRequest) {
        String result = validationService.validateEventDetails(eventRequest);
        return ResponseEntity.ok(result);
    }
}

