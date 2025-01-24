package com.hope.donation_management;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "donations")
@Data  // Lombok annotation to generate getters, setters, constructors, and toString method
public class Donation {

    private String id;
    private String userId;
    private double amount;
    private String date;
    private String description;

}
