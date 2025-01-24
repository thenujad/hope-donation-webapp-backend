package com.hope.validation;

import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
public class ValidationService {

    // Regex for email validation
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public String validateEmail(String email) {
        if (email == null || !Pattern.matches(EMAIL_REGEX, email)) {
            return "Invalid email format";
        }
        // Add additional logic for checking email availability in your system if required
        return "Email is valid";
    }

    public String validateEventDetails(EventValidationRequest eventRequest) {
        if (eventRequest.getEventName() == null || eventRequest.getEventName().isEmpty()) {
            return "Event name cannot be empty";
        }
        if (eventRequest.getEventDate() == null || !eventRequest.getEventDate().matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "Invalid event date format (Expected: YYYY-MM-DD)";
        }
        if (eventRequest.getLocation() == null || eventRequest.getLocation().isEmpty()) {
            return "Event location cannot be empty";
        }
        return "Event details are valid";
    }
}
